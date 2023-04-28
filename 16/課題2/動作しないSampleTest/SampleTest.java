package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class SampleTest {

    /*
     * @Nestedを使った場合、 テストを実行しても反応がない（エラーにも成功にもならない）
     */

    @Nested
    class group {

        @Test
        public void testGetColor() {

            assertEquals("赤", Sample.getColor(1));
            assertEquals("黒", Sample.getColor(2));
            assertEquals("青", Sample.getColor(3));
        }

        @Test
        @DisplayName("引数エラー")
        public void fail() {
            assertThrows(IllegalArgumentException.class, () -> Sample.getColor(99));
        }

    }
}
