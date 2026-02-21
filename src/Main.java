//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var oneSup = 8;
    var sup = 80;
    var sumHour = 0;

    sup = 80+94;
    sumHour = sup * oneSup;

    System.out.println("Если в компании работает " + sup + " человек, то всего " + sumHour
            + " часов работы может быть поделено между сотрудниками");

    System.out.println("Всего работников в компании " + (sumHour / oneSup));
}

