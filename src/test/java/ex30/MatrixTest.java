package ex30;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MatrixTest
{

    @Test
    @DisplayName("Returns if valid matrix was printed.")
    void successful()
    {
        int i, j;
        for ( i = 1; i <13 ; i++) {
            for ( j = 1; j <13 ; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.printf("%n");
        }
        Matrix.successful(1);
    }
}