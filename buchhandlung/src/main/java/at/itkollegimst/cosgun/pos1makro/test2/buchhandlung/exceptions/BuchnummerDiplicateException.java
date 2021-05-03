package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class BuchnummerDiplicateException extends Exception {


    public BuchnummerDiplicateException() {super("Diese Buchnummer existiert bereits");}


}
