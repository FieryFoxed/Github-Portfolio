package activity19;

public class Subclass2 extends Superclass{

    private double hoursLeftToSubmitProject;

    public Subclass2(String projectName, int numberOfFiles, int numberOfLines){
        super(projectName, numberOfFiles, numberOfLines);
        this.hoursLeftToSubmitProject = hoursLeftToSubmitProject;
    }

    public double getHoursLeftToSubmitProject(){
        return hoursLeftToSubmitProject;
    }

    public void setHoursLeftToSubmitProject(double hoursLeftToSubmitProject){
        this.hoursLeftToSubmitProject = hoursLeftToSubmitProject;
    }


    @Override
    public String toString(){
        return String.format("Project name: %s%nNumber of files in the project: %s%nNumber of files in the project: %s%nHours left to submit project: %s%n", getName(), getNumberOfFiles(), getNumberOfLines(), getHoursLeftToSubmitProject());
    }


}
