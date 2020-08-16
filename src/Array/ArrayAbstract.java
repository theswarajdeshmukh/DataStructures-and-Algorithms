package Array;

    class Person {
        private String FirstName;
        private int Age;
        private String LastName;

        public Person(String first, int a , String last){
            first = this.FirstName;
            a = this.Age;
            last = this.LastName;
        }

        public void DisplayPerson()
        {
            System.out.println(" Last Name:  " + LastName);
            System.out.println(" First Name:  " + FirstName);
            System.out.println(" Age:  " + Age);
        }

        public String getLastName() {
            return LastName;
        }
    }

    class PersonData{
        private Person[] a;
        private int nElems;

        public PersonData(int max){
            a = new Person[max];
            nElems = 0;
        }

        public Person find(int searchname)
        {
            int j;
            for (j=0;j<=nElems;j++)
                if (a[j].getLastName().equals(searchname))
                    break;
            if(j == nElems)
                return null;
            else
                return a[j];
        }

        public void insert(String first,int age,String last)
        {
            a[nElems] = new Person(first,age,last);
            nElems++;
        }

        public boolean delete(String searchName)
        {
            int j;
            for (j=0; j<=nElems; j++)
                if (a[j].equals(searchName))
                    break;
            if (j==nElems)
                return false;
            else
            {
                for (int k=j;k<nElems;j++)
                    a[k] = a[k+1];
                nElems--;
                return true;
            }
        }

        public void display()
        {
            for (int j=0;j<nElems;j++){
                a[j].DisplayPerson();
            }
        }

    }


    public class ArrayAbstract {

        public static void main(String[] args) {

            PersonData Per = new PersonData(10);

        }

    }

