package activity19;

public class Subclass1 extends Superclass{

    private int requiredNumberOfFiles;

    public Subclass1(String projectName, int numberOfFiles, int numberOfLines){
        super(projectName, numberOfFiles, numberOfLines);
        this.requiredNumberOfFiles = requiredNumberOfFiles;
    }

    public int getRequiredNumberOfFiles(){
        return requiredNumberOfFiles;
    }

    public void setRequiredNumberOfFiles(int requiredNumberOfFiles){
        this.requiredNumberOfFiles = requiredNumberOfFiles;
    }

    @Override
    public String toString() {

    return String.format("Project Name: %s%nNumber of files in the project: %d%nNumber of lines in the files%d%nNumber of files required: %d%n",
            getName(), getNumberOfFiles(), getNumberOfLines(), getRequiredNumberOfFiles());
    }
}
