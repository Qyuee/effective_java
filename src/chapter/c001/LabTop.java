package chapter.c001;

/**
 * 생성자를 제공하는 클래스
 */
public class LabTop {
    private String model;
    private String company;

    public LabTop() {
    }

    public LabTop(String model, String company) {
        this.model = model;
        this.company = company;
    }

    // 정적 팩토리 메서드
    public static LabTop ofModelNameAndCompany(String model, String company) {
        LabTop labTop = new LabTop();
        labTop.model = model;
        labTop.company = company;
        return labTop;
    }
}
