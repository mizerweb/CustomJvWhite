package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class jj7 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = vqi.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void b(lwa lwaVar) {
        jwa jwaVar;
        lwaVar.getClass();
        z88 z88VarL = c98.l();
        jwa[] jwaVarArr = lwaVar.a;
        int length = jwaVarArr.length;
        int i = 0;
        while (true) {
            jwa jwaVar2 = null;
            if (i >= length) {
                break;
            }
            jwa jwaVar3 = jwaVarArr[i];
            if (cz3.class.isAssignableFrom(jwaVar3.getClass())) {
                jwa jwaVar4 = (jwa) cz3.class.cast(jwaVar3);
                if (((cz3) jwaVar4).c.equals("iTunSMPB")) {
                    jwaVar2 = jwaVar4;
                }
            }
            if (jwaVar2 != null) {
                z88VarL.c(jwaVar2);
            }
            i++;
        }
        a98 a98VarListIterator = z88VarL.h().listIterator(0);
        while (a98VarListIterator.hasNext()) {
            if (a(((cz3) a98VarListIterator.next()).d)) {
                return;
            }
        }
        z88 z88VarL2 = c98.l();
        for (jwa jwaVar5 : jwaVarArr) {
            if (yj8.class.isAssignableFrom(jwaVar5.getClass())) {
                jwaVar = (jwa) yj8.class.cast(jwaVar5);
                yj8 yj8Var = (yj8) jwaVar;
                if (!(yj8Var.b.equals("com.apple.iTunes") && yj8Var.c.equals("iTunSMPB"))) {
                    jwaVar = null;
                }
            } else {
                jwaVar = null;
            }
            if (jwaVar != null) {
                z88VarL2.c(jwaVar);
            }
        }
        a98 a98VarListIterator2 = z88VarL2.h().listIterator(0);
        while (a98VarListIterator2.hasNext() && !a(((yj8) a98VarListIterator2.next()).d)) {
        }
    }
}
