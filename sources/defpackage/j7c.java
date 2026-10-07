package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class j7c {
    public final ny8 a;
    public final ny8 b;

    public j7c(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static SpannableString d(CharSequence charSequence, List list, kbc kbcVar) {
        if (charSequence == null || charSequence.length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() != 0 && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                caf cafVar = (caf) it.next();
                spannableString.setSpan(new fqh(kbcVar, new pyb(5)), cafVar.a, cafVar.b, 17);
            }
        }
        return spannableString;
    }

    public static SpannableString e(kbc kbcVar, xcd xcdVar, List list) {
        CharSequence charSequence = xcdVar.a;
        return charSequence.length() == 0 ? new SpannableString("") : d(xoh.d(charSequence.toString()), list, kbcVar);
    }

    public static CharSequence g(CharSequence charSequence, List list, String[] strArr) {
        if (charSequence.length() != 0 && !list.isEmpty() && strArr.length != 0) {
            int length = strArr.length;
            loop0: for (int i = 0; i < length; i++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.length() != 0) {
                        String str2 = strArr[i];
                        Pattern pattern = xoh.a;
                        if (str2.regionMatches(true, 0, str, 0, str.length())) {
                            int iV0 = r5h.V0(charSequence.toString(), strArr[i], 0, false, 6);
                            if (i == 0 || iV0 <= 10) {
                                break loop0;
                                break loop0;
                            }
                            return new SpannableString(new SpannableStringBuilder().append((CharSequence) "...").append(charSequence.subSequence((int) Math.max(0.0d, iV0 - 10), charSequence.length())));
                        }
                    }
                }
            }
        }
        return charSequence;
    }

    public final List a(String str, List list) {
        return c().c(xoh.d(str), list);
    }

    public final CharSequence b(kbc kbcVar, vg4 vg4Var, String str) {
        kx6 kx6Var;
        int i = 4;
        ohf ohfVarK0 = a.K0(new ohf[]{new m2i(new sw(1, vg4Var.q()), new pyb(i)), new sw(2, vg4Var.r())});
        nre nreVar = new nre(i);
        if (ohfVarK0 instanceof m2i) {
            m2i m2iVar = (m2i) ohfVarK0;
            kx6Var = new kx6(m2iVar.a, m2iVar.b, nreVar);
        } else {
            kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
        }
        l2i l2iVar = (l2i) new m2i(yhf.m0(kx6Var, new iaa(this, 21, str)), new os1(this, str, kbcVar, 15)).iterator();
        if (l2iVar.hasNext()) {
            return (CharSequence) l2iVar.next();
        }
        ore.f("Sequence is empty.");
        return null;
    }

    public final daf c() {
        return (daf) this.a.getValue();
    }

    public final boolean f(String str, List list) {
        return !c().c(str, list).isEmpty();
    }
}
