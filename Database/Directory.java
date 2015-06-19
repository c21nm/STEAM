public class Directory{

    public static void main(String [] args){

        
         

        Data nm = new Data("Nate", "Mettke", 11);

        System.out.println(nm.getFirstName() + " " + nm.getLastName() + " " + nm.getAge());
        
        Data mm = new Data (); 
        mm.setFirstName("Mike");
        mm.setLastName("Mettke");

        Data em = new Data (); 
        em.setFirstName("Ella");
        em.setLastName("Mettke");

        Data [] nate_relations = new Data[2];
        nate_relations[0]= em;
        nate_relations[1] = mm;
        nm.setRelations(nate_relations);

        System.out.println(nm.getFirstName() + " " + nm.getLastName());
        System.out.println("Nate's Relations: ");
        for(Data data: nm.getRelations()){
            System.out.println(data.getFirstName());
            
        }//for loop



        System.out.println(mm.getFirstName() + " " + mm.getLastName());
        System.out.println(em.getFirstName() + " " + em.getLastName());
    }//main
}//program
