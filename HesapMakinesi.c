#include <stdio.h>

int main() {
    char operation;
    double num1, num2, result;

    // Kullanıcıdan sayıları ve işlemi al
    printf("İlk sayıyı girin: ");
    scanf("%lf", &num1);

    printf("İkinci sayıyı girin: ");
    scanf("%lf", &num2);

    printf("İşlemi seçin (+, -, *, /): ");
    scanf(" %c", &operation);

    // İşlemi gerçekleştir
    switch(operation) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                printf("Hata! Sıfıra bölme hatası.\n");
                return 1; // Programı sonlandır
            }
            break;
        default:
            printf("Hata! Geçersiz işlem.\n");
            return 1; // Programı sonlandır
    }

    // Sonucu ekrana yazdır
    printf("Sonuç: %.2lf %c %.2lf = %.2lf\n", num1, operation, num2, result);

    return 0;
}
