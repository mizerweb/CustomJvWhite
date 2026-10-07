package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class age {
    public static String a(dg7 dg7Var) {
        String string = dg7Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
