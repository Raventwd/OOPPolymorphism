public class Mechanic {
    private String nameSurname;
    private String company;

    public Mechanic(String nameSurname, String company){
        this.nameSurname=nameSurname;
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNameSurname() {
        return nameSurname;
    }


    public void maintenance() {
        System.out.println("Техобслуживание");
    }
    public void repairCar() {
        System.out.println("Починить авто");
    }
}
