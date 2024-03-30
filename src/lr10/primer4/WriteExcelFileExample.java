package lr10.primer4;

import  java.io.FileInputStream;
import java.io.FileOutputStream;
import  java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
public class WriteExcelFileExample {
    public static void main(String[] args) throws  IOException {
        // Создаем новую книги Excel
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        //записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристик");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intrl Core i5, перативная память");
        dataRow2.createCell(2).setCellValue(25000.0);


        //записываем книгу в Excel файл
        String filePath = "src/lr10/primer4/example4.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Данные записаны в файл" + filePath);

    }
}
