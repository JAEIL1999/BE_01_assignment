# BE_01 : 계산기를 만들어라
## 파일 경로
CalculatorProject/src/com/example/calculatorLV1
CalculatorProject/src/com/example/calculatorLV2

## 동작 설명(LV2 기준)
- 0 이상의 정수 두 개를 입력 후 연산 기호 입력(사칙연산)
- 입력받은 정수가 음수라면 재입력, 입력받은 연산 기호가 사칙연산 기호가 아니라면 재입력
- 연산 수행 (0으로 나누는 경우에는 경고문)
- 연산된 값을 저장하는 컬렉션(컬렉션은 ArrayList<Integer>로 구성), 0으론 나누는 경우에는 연산된 값 저장 ✖️
- 연산된 값을 저장하는 과정에서 Getter, Setter 사용
- 계산이 되고 사용자가 exit를 입력하지 않을때까지 무한 반복
- 만약 사용자가 n번 초과의 유효한 연산(컬렉션에 저장된 값이 n개)을 수행하면 가장 먼저 저장된 값 삭제(n은 사용자가 설정 가능)
