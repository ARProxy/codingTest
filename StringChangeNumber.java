import java.util.stream.Stream;

public class StringChangeNumber {
    public static void main(String[] args) {
        String str = "10";
        int result = Stream.of(str).mapToInt(x -> Integer.parseInt(x))
                //각 요소에 함수를 적용하여 결과를 int 스트림으로 변환한다.
                .boxed().findFirst()//스트림에서 첫번째 요소를 가져온다.
                .orElseThrow(NumberFormatException::new);
                //Optional의 orElseThrow() 메서드는 값이 존재하면 그 값을 반환하고 값이 없으면 지전된 예외를 발생시킨다.
        System.out.println(result);
    }
}
