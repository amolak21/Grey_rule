package in.sp.dbqueries;

import in.sp.dbconn.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbQueries {

    public static boolean checkEmailExist(String email) {
        boolean status = false;

        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("select * from register where email=?");) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static boolean registerUser(String name, String email, String pass, String gender, String city) {
        boolean status = false;

        String profile_pic = "";
        if (gender.equals("Male")) {
            profile_pic = "male.png";
        } else {
            profile_pic = "female.png";
        }

        try (
                Connection con = DbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, gender);
            ps.setString(5, city);
            ps.setString(6, profile_pic);

            int i = ps.executeUpdate();
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static ResultSet login(String email, String pass) {
        ResultSet rs = null;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, pass);

            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public static boolean updateProfile(String name, String email, String gender, String city) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("update register set name=?, gender=?, city=? where email=?");
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, city);
            ps.setString(4, email);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static boolean updateProfilePic(String email, String attachment_name) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("update register set profile_pic=? where email=?");
            ps.setString(1, attachment_name);
            ps.setString(2, email);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static boolean uploadStatus(String email, String status_text, String status_img, String date1, String time1) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("insert into status(email , status_text , status_image , date1, time1) values(?,?,?,?,?)");
            ps.setString(1, email);
            ps.setString(2, status_text);
            ps.setString(3, status_img);
            ps.setString(4, date1);
            ps.setString(5, time1);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static ResultSet getStatusOfUser(String email) {
        ResultSet rs = null;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from status where email=? ORDER BY date1 DESC, time1 DESC");
            ps.setString(1, email);

            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static ResultSet getAllStatus() {
        ResultSet rs = null;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select status.*, register.name, register.profile_pic from status JOIN register ON status.email = register.email ORDER BY date1 DESC, time1 DESC");

            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean deleteStatus(String email, String date1, String time1) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("delete from status where email=? and date1=? and time1=?");
            ps.setString(1, email);
            ps.setString(2, date1);
            ps.setString(3, time1);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public static ResultSet userProfileDetails(String email) {
        ResultSet rs = null;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from register where email=?");
            ps.setString(1, email);

            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static ResultSet userProfileStatus(String email) {
        ResultSet rs = null;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from status where email=?");
            ps.setString(1, email);

            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean deleteUserProfileDetails(String email) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("delete from register where email=?");
            ps.setString(1, email);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public static boolean deleteUserStatusDetails(String email) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("delete from status where email=?");
            ps.setString(1, email);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public static boolean likeStatus(String statusid, String email1) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("insert into likes value(?,?)");

            ps.setString(1, statusid);
            ps.setString(2, email1);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static boolean displayLikeOrDislikeIcon(String statusid, String session_email) {

        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from likes where statusid=? and email =?");
            ps.setString(1, statusid);
            ps.setString(2, session_email);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;

    }

    public static boolean dislikeStatus(String statusid, String email1) {
        boolean status = false;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("delete from likes where statusid=? and email=?");

            ps.setString(1, statusid);
            ps.setString(2, email1);

            int count = ps.executeUpdate();
            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public static int countLikes(String statusid) {
       
        int count_likes=0;
        try {
            Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select count(*) from likes where statusid=?");
            ps.setString(1, statusid);

            ResultSet rs = ps.executeQuery();
            rs.next();
            count_likes = rs.getInt(1);
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return count_likes;
    }
}
