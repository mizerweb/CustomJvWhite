package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.Arrays;
import java.util.Optional;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class i46 {
    public Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ i46(Object obj) {
        this.a = obj;
    }

    public Optional a() {
        return Arrays.stream((w4k[]) this.c).map(new am(28, this)).map(new lbk(8)).filter(new lak(29)).findFirst();
    }

    public void b() {
        String strC1;
        f25 f25Var;
        an anVar = (an) this.a;
        CidLogger cidLogger = anVar.a.b;
        Integer num = anVar.c;
        Integer num2 = (Integer) this.b;
        if (num2 != null) {
            long jIntValue = ((long) num2.intValue()) & 4294967295L;
            tre.M(16);
            String string = Long.toString(jIntValue, 16);
            string.getClass();
            strC1 = r5h.c1(string, string.length() > 6 ? 8 : 6, '0');
        } else {
            strC1 = null;
        }
        f25 f25Var2 = ((an) this.a).d;
        Boolean boolValueOf = f25Var2 != null ? Boolean.valueOf(f25Var2.b()) : null;
        cidLogger.log("AniSend", anVar + ": isReady: v=" + num + " bgColor=" + strC1 + "} connected=" + boolValueOf + " senderThread=" + ((an) this.a).e);
        Integer num3 = ((an) this.a).c;
        if (num3 == null) {
            return;
        }
        if (num3.intValue() != 1 && (((Integer) this.b) == null || ((an) this.a).e == null || (f25Var = ((an) this.a).d) == null || !f25Var.b())) {
            return;
        }
        ((an) this.a).g = null;
        Integer num4 = (Integer) this.b;
        if (num4 != null) {
            ((an) this.a).e(num4.intValue());
        }
        Double[] dArr = (Double[]) this.c;
        if (dArr != null) {
            ((an) this.a).a(dArr);
        }
    }

    public void c() {
        l46 l46Var = (l46) this.a;
        try {
            l46Var.f.a(new h46(this));
        } catch (Throwable th) {
            l46Var.d(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:7:0x0017, B:10:0x001c, B:12:0x0020, B:14:0x002d, B:22:0x004e, B:24:0x0058, B:26:0x005b, B:28:0x005e, B:30:0x006e, B:31:0x0071), top: B:70:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:7:0x0017, B:10:0x001c, B:12:0x0020, B:14:0x002d, B:22:0x004e, B:24:0x0058, B:26:0x005b, B:28:0x005e, B:30:0x006e, B:31:0x0071), top: B:70:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public CharSequence d(CharSequence charSequence, int i, int i2, boolean z) throws Throwable {
        yci yciVar;
        CharSequence charSequence2;
        Throwable th;
        int i3;
        ieg iegVar;
        m9i[] m9iVarArr;
        int spanStart;
        kr6 kr6Var = (kr6) this.b;
        kr6Var.getClass();
        boolean z2 = charSequence instanceof ieg;
        if (z2) {
            ((ieg) charSequence).a();
        }
        if (z2) {
            yciVar = new yci((Spannable) charSequence);
            if (yciVar != null) {
                for (m9i m9iVar : m9iVarArr) {
                    spanStart = yciVar.b.getSpanStart(m9iVar);
                    int spanEnd = yciVar.b.getSpanEnd(m9iVar);
                    if (spanStart != i2) {
                        yciVar.removeSpan(m9iVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            if (i3 != i2) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                iegVar = (ieg) charSequence2;
                iegVar.b();
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                iegVar = (ieg) charSequence2;
                iegVar.b();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    yciVar = new yci((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((ieg) charSequence2).b();
                    throw th;
                }
            } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, m9i.class) > i2) {
                yciVar = null;
            } else {
                yciVar = new yci();
                yciVar.a = false;
                yciVar.b = new SpannableString(charSequence);
            }
            if (yciVar != null && (m9iVarArr = (m9i[]) yciVar.b.getSpans(i, i2, m9i.class)) != null && m9iVarArr.length > 0) {
                while (i < r4) {
                    spanStart = yciVar.b.getSpanStart(m9iVar);
                    int spanEnd2 = yciVar.b.getSpanEnd(m9iVar);
                    if (spanStart != i2) {
                        yciVar.removeSpan(m9iVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            if (i3 != i2 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                iegVar = (ieg) charSequence2;
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        yci yciVar2 = (yci) kr6Var.K(charSequence2, i3, i2, Integer.MAX_VALUE, z, new ih(yciVar, (ou7) kr6Var.a));
                        if (yciVar2 == null) {
                            if (z2) {
                                iegVar = (ieg) charSequence2;
                            }
                            return charSequence2;
                        }
                        Spannable spannable = yciVar2.b;
                        if (z2) {
                            ((ieg) charSequence2).b();
                        }
                        return spannable;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z2) {
                            throw th;
                        }
                        ((ieg) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            iegVar.b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((ieg) charSequence2).b();
        throw th;
    }
}
