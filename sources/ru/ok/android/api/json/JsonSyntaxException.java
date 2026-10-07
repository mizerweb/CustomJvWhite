package ru.ok.android.api.json;

import defpackage.a05;
import defpackage.nbh;
import defpackage.qt4;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class JsonSyntaxException extends IOException {
    public static JsonSyntaxException a(long j, String str, int i) {
        if (i >= 0) {
            return i < 31 ? new JsonSyntaxException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", Integer.valueOf(i), Long.valueOf(j), str)) : new JsonSyntaxException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str));
        }
        Locale locale = Locale.US;
        StringBuilder sbT = qt4.t(j, "Unexpected EOF at pos ", " after `", str);
        sbT.append("`");
        return new JsonSyntaxException(sbT.toString());
    }

    public static JsonSyntaxException b(long j, String str, int i) {
        if (i != 0) {
            String strI = a05.i(i);
            Locale locale = Locale.US;
            return new JsonSyntaxException(qt4.q(nbh.B(j, "Unexpected ", strI, " at pos "), " near `", str, "`"));
        }
        Locale locale2 = Locale.US;
        StringBuilder sbT = qt4.t(j, "Unexpected eof at pos ", " after `", str);
        sbT.append("`");
        return new JsonSyntaxException(sbT.toString());
    }
}
