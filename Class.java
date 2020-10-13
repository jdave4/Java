public class Pet
    {
        private String name;
        private String animal;
        private int age;
		private String location;
    
        public Pet(String name, String location, int age)
        {
            this.name = name;
            this.location = location;
            this.age = age;
        }
    
        public String getName()
        {
            return name;
        }
    
        public void setName(String name)
        {
            this.name = name;
        }
    
        public String getlocation()
        {
            String location;
			return location;
        }
    
        public void setlocation(String location)
        {
            this.location = location;
        }
    
        public int getAge()
        {
            return age;
        }
    
        public void setAge(int age)
        {
            this.age = age;
        }
    }
    
}
