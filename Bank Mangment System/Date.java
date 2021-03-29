public class Date
{
	private int x;
	private int y;
	private int z;

	public Date()
	{
		  z=0;
	   	  x=0;
		  y=0;
	}
	public Date(int x,int y,int z)
	{
		  setX(x);
		  setY(y);
		  setZ(z);
	}
	public Date(Date d)
	{
		  this.setX(d.getX());
		  this.setY(d.getY());
		  this.setZ(d.getZ());
	}
	public void setX(int x)
	{
		  if(x>0 && x<32)
		  {
		         this.x=x;
		  }
		  else
		  {
				 this.x=0;
		  }
	}
	public void setY(int y)
	{
		  if(y>0 && y<13)
	 	  { 
		         this.y=y;
		  }
		  else
		  {
				 this.y=0;
		  }
	}
	public void setZ(int z)
	{
		  if(z>1800 && z<2020)
		  {
		         this.z=z;
	  	  }
		  else
		  {
				 this.z=0;
		  }
	}
	public int getX()
	{
		  return x;
	}
	public int getY()
	{
		  return y;
	}
	public int getZ()
	{
		  return z;
	}
	public String getDate()
	{
		  if(x<10 && y>9 && z!=0)
		  {
			    return "0"+getX()+"-"+getY()+"-"+getZ();
		  }
		  else if (x>9 && y<10 && z!=0)
		  {
			    return getX()+"-0"+getY()+"-"+getZ();	
		  }
		  else if (x<10 && y<10 && z!=0)
		  {
			    return "0"+getX()+"-0"+getY()+"-"+getZ();
		  }
		  else if(x<10 && y>9 && z==0)
		  {
			    return "0"+getX()+"-"+getY()+"-000"+getZ();
		  }
		  else if(z>9 && y<10 && z==0)
		  {
			    return getX()+"-0"+getY()+"-000"+getZ();
	   	  }
		  else if(z==0 && y<10 && x<10)
		  {
			    return "0"+getX()+"-0"+getY()+"-000"+getZ();
		  }
		  else
		  {
			    return getX()+"-"+getY()+"-"+getZ();
		  }
	}
}