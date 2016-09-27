login
{
	Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/transport?zeroDateTimeBehavior=convertToNull","root","root");
          Statement smt=conn.createStatement();
String s=select * from account;                                    //Table account
		  ResultSet rs=smt.executeQuery(s);
       while(rs.next())
	   {
		  if((jlabel1.getText().equals(rs.getString("username")))&&(jlabel2.getText().equals(rs.getString("password"))));
		  {
			  JOptionPane.showMessageDialog(null,"Login Successfully");
if(rs.getString("TYPE").equals("user"))			
{
	frame3 obj=new frame3();														//Book a delivery
		  this.dispose();
		  obj.userinfo(rs.getString("username"),rs.getString("password"));                  //userinfo function is created  to send the user info
		  obj.visible();
break;
		  }
	
if(rs.getString("TYPE").equals("driver"))			
{
   truckdriver obj=new truckdriver();														//Book a delivery
		  this.dispose();
		  obj.visible();
break;
		  }

}  
}
}






signup


	Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/transport?zeroDateTimeBehavior=convertToNull","root","root");
          Statement smt=conn.createStatement();
		  PreparedStatement ps=new preparedStatement("insert into account values(?,?,?)");
		  int i=ps.executeQuery();
ps.setString(2,jLabel1.getText());
ps.setString(3,jLabel3.getText());
ps.setString(1,JComboBox3.getSelectedItem().toString());
	if(i>0)
	{
		JOptionPane.showMessageDialog(null,"new user added successfully");
	loginframe lf=new loginframe();
	this.dispose();
	lf.visible();
	
	}
		else 
	JOptionPane.showMessageDialog(null,"Error");
                                         


										 