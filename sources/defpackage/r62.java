package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r62 extends a8j {
    public static final ylc g = new ylc(gm0.a("", Long.MIN_VALUE), rki.c(R.drawable.saved_group_call_avatar).toString());
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;

    public r62(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var2;
        this.d = ny8Var;
        mjg mjgVarA = p90.a(m62.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        e9i.j0(e9i.T(new fz6(((ya1) ((da1) ny8Var2.getValue())).j, new in1(this, (lq4) null, 6), 3), ((n0c) ((xhh) ny8Var3.getValue())).a()), this.b);
    }

    public static final c79 B(r62 r62Var, Collection collection) {
        boolean z = collection.size() > 3;
        List<q42> listN1 = ww3.N1(collection, z ? 2 : collection.size());
        ArrayList arrayList = new ArrayList(yw3.W0(listN1, 10));
        for (q42 q42Var : listN1) {
            arrayList.add(new ylc(gm0.a(q42Var.g(), Long.valueOf(q42Var.p())), q42Var.a()));
        }
        c79 c79VarW = yab.w();
        c79VarW.addAll(arrayList);
        if (z) {
            c79VarW.add(g);
        }
        return yab.j(c79VarW);
    }

    public static final CharSequence C(r62 r62Var, CharSequence charSequence) {
        if (!r5h.X0(charSequence)) {
            List listL1 = r5h.l1(r5h.y1(charSequence), new char[]{' '});
            if (listL1.size() >= 2) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ww3.r1(listL1));
                spannableStringBuilder.append((CharSequence) " ");
                CharSequence charSequence2 = (CharSequence) ww3.B1(listL1);
                if (charSequence2.length() == 0) {
                    ore.f("Char sequence is empty.");
                    return null;
                }
                spannableStringBuilder.append((CharSequence) String.valueOf(charSequence2.charAt(0)).toUpperCase(Locale.ROOT));
                spannableStringBuilder.append((CharSequence) ".");
                return new SpannedString(spannableStringBuilder);
            }
        }
        return charSequence;
    }
}
