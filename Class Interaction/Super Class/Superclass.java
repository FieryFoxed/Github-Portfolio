package activity19;

public class Superclass {
    private String projectName;
    private int numberOfFiles;
    private int numberOfLines;

    public Superclass(String projectName, int numberOfFiles, int numberOfLines){
        this.projectName = projectName;
        this.numberOfFiles = numberOfFiles;
        this.numberOfLines = numberOfLines;
    }

    public String getName(){
        return projectName;
    }

    public void setName(String projectName){
        this.projectName = projectName;
    }

    public int getNumberOfFiles(){
        return numberOfFiles;
    }

    public void setNumberOfFiles(int numberOfFiles){
        this.numberOfLines = numberOfFiles;
    }

    public int getNumberOfLines(){
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines){
        this.numberOfLines = numberOfLines;
    }

    @Override
    public String toString(){
        return String.format("Project Name: %s%nNumber of files in the project: %d%nNumber of lines in the files%d%n", projectName, numberOfFiles, getNumberOfLines());
    }
}
