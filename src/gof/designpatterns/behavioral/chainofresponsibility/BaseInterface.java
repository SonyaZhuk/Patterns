package gof.designpatterns.behavioral.chainofresponsibility;


/**
 * Метод handleRequest() определяет, как обрабатывать переданное сообщение.
 * <p>
 * Применяются различные стратегии реализации обработчика handleRequest():
 * — динамическая. Каждый класс-обработчик реализует свой процесс обработки с возможностью изменения стратегии пересылки;
 * — расширяющая. Каждый последующий обработчик добавляет свой функционал к предыдущему;
 * — дефолтная. Существует класс-обработчик, используемый всеми уровнями при отсутствии явного класса пересылки.
 * Также существуют различные стратегии пересылки:
 * — пересылка всех сообщений, кроме обрабатываемых явным образом;
 * — обработка всех сообщений, кроме пересылаемых явным образом;
 * — обработка по умолчанию сообщений, для которых не указан обработчик;
 * — отказ от обработки сообщений, для которых не указан обработчик.
 */
public interface BaseInterface {
    String handleRequest();
}