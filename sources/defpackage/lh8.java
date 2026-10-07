package defpackage;

import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lh8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ nh8 f;
    public final /* synthetic */ x0c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh8(nh8 nh8Var, x0c x0cVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = nh8Var;
        this.g = x0cVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x0c x0cVar = this.g;
        nh8 nh8Var = this.f;
        switch (i) {
            case 0:
                return new lh8(nh8Var, x0cVar, lq4Var, 0);
            default:
                return new lh8(nh8Var, x0cVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((lh8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        luc lucVarT;
        String strReplaceAll;
        StringBuilder sb;
        int length;
        int i;
        int i2;
        char cCharAt;
        int i3 = this.e;
        x0c x0cVar = this.g;
        switch (i3) {
            case 0:
                ch3.d0(obj);
                String str = x0cVar.a;
                nh8 nh8Var = this.f;
                ynh ynhVar = (ynh) nh8Var.l.d(str);
                if (ynhVar != null) {
                    return ynhVar;
                }
                vtc vtcVar = (vtc) nh8Var.b.getValue();
                Logger logger = vtc.h;
                String string = null;
                if (vtcVar.n(str)) {
                    kuc kucVarI = vtc.i(vtcVar.g(str), 2);
                    try {
                        lucVarT = kucVarI.e ? vtcVar.t(kucVarI.f, str) : null;
                        break;
                    } catch (NumberParseException e) {
                        logger.log(Level.SEVERE, e.toString());
                    }
                    if (vtcVar.m(lucVarT)) {
                        strReplaceAll = Pattern.compile("\\d").matcher(Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(vtcVar.d(lucVarT)).replaceAll("")).replaceAll(String.valueOf('X'));
                        sb = new StringBuilder();
                        length = strReplaceAll.length();
                        i = 1;
                        for (i2 = 0; i2 < length; i2++) {
                            cCharAt = strReplaceAll.charAt(i2);
                            if (cCharAt == 'X') {
                                sb.append(i);
                                i = (i + 1) % 10;
                            } else if (cCharAt == '-') {
                                sb.append(' ');
                            } else {
                                sb.append(cCharAt);
                            }
                        }
                        string = r5h.y1(sb.toString()).toString();
                    } else {
                        gm0.Y(vtc.class.getName(), "Early return in hintForCountry cuz of !isValidNumber(examplePhoneNumber)");
                    }
                    return new xnh(string != null ? string : "");
                }
                logger.log(Level.WARNING, "Invalid or unknown region code provided: ".concat(str));
                if (vtcVar.m(lucVarT)) {
                    gm0.Y(vtc.class.getName(), "Early return in hintForCountry cuz of !isValidNumber(examplePhoneNumber)");
                } else {
                    strReplaceAll = Pattern.compile("\\d").matcher(Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(vtcVar.d(lucVarT)).replaceAll("")).replaceAll(String.valueOf('X'));
                    sb = new StringBuilder();
                    length = strReplaceAll.length();
                    i = 1;
                    while (i2 < length) {
                        cCharAt = strReplaceAll.charAt(i2);
                        if (cCharAt == 'X') {
                            sb.append(i);
                            i = (i + 1) % 10;
                        } else if (cCharAt == '-') {
                            sb.append(' ');
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    string = r5h.y1(sb.toString()).toString();
                }
                return new xnh(string != null ? string : "");
            default:
                ch3.d0(obj);
                int i4 = x0cVar.b;
                zv8[] zv8VarArr = nh8.m;
                return new Integer(15 - String.valueOf(i4).length());
        }
    }
}
