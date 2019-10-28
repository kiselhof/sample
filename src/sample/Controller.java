package sample;

public class Controller {

    public void handleButtonClick(){
        Human human = new Human();
        SaveToXml xml = new SaveToXml("D:/Ann/season2/sample/src/sample/student.xml");
        human = xml.LoadXmlFile();
        //System.out.println(human.get_name());
        human.Print();
  }
}
