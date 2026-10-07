package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.messages.c;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lac {
    public final Context a;
    public final zed b;
    public final ny8 d;
    public final ny8 e;
    public final String c = lac.class.getName();
    public final ifh f = new ifh(new cka(14));

    public lac(ny8 ny8Var, Context context, zed zedVar, ny8 ny8Var2) {
        this.a = context;
        this.b = zedVar;
        this.d = ny8Var;
        this.e = ny8Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(defpackage.fda r10) {
        /*
            eia r10 = r10.c
            if (r10 == 0) goto L33
            fda r0 = r10.c
            int r10 = r10.a
            r1 = 1
            if (r10 != r1) goto L33
            if (r0 == 0) goto L16
            fda r10 = r0.b()
            if (r10 != 0) goto L14
            goto L16
        L14:
            r0 = r10
            goto L19
        L16:
            if (r0 != 0) goto L19
            goto L33
        L19:
            kac r1 = new kac
            sfa r2 = r0.a
            vg4 r3 = r0.b
            eia r4 = r0.c
            fda r5 = r0.d
            ru.ok.tamtam.messages.c r6 = r0.e
            uia r7 = r0.f
            zja r8 = r0.g
            e13 r9 = r0.h
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r10 = java.util.Collections.singletonList(r1)
            return r10
        L33:
            r66 r10 = defpackage.r66.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lac.a(fda):java.util.List");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    public final roh b(rt2 rt2Var, fda fdaVar) {
        CharSequence charSequenceH;
        CharSequence charSequence;
        int i;
        c cVar = fdaVar.e;
        sfa sfaVar = fdaVar.a;
        boolean z = fdaVar instanceof kac;
        boolean z2 = false;
        z = false;
        z = false;
        boolean z3 = false;
        z2 = false;
        Context context = this.a;
        if (!z) {
            String str = sfaVar.g;
            if (str == null || str.length() == 0 || sfaVar.W()) {
                return null;
            }
            if (TextUtils.isEmpty(cVar.d(rt2Var)) || sfaVar.m() != 0) {
                CharSequence charSequenceC = fdaVar.c(rt2Var);
                vbf vbfVarF = pq3.j.e(context).m().f();
                if (fdaVar.d() || (rt2Var != null && rt2Var.d0())) {
                    z2 = true;
                }
                Spannable spannableK = xr8.k(charSequenceC, f55.g(vbfVarF, z2).b.a, (24 & 4) != 0, null);
                if (spannableK != null) {
                    charSequenceC = spannableK;
                }
                return new roh(((vxb) ((a31) this.d.getValue())).h(), charSequenceC, true, 496);
            }
            float fK = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
            cVar.a(rt2Var);
            cVar.f = rt2Var;
            p4c p4cVar = cVar.a;
            cVar.n(rt2Var, p4cVar.h(), p4cVar.f());
            cVar.k(rt2Var);
            CharSequence charSequence2 = cVar.i;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            if ((sfaVar.W() || (!TextUtils.isEmpty(cVar.d(rt2Var)) && sfaVar.m() == 0)) && fdaVar.c == null) {
                z3 = true;
            }
            return new roh(fK, charSequence2, !z3, HttpStatus.SC_GATEWAY_TIMEOUT);
        }
        zed zedVar = this.b;
        boolean z4 = zedVar.c.d.getBoolean("audio.transcription.enabled", true);
        String str2 = sfaVar.g;
        if (str2 != null && str2.length() != 0 && !sfaVar.W()) {
            charSequenceH = fdaVar.c(rt2Var);
        } else if (sfaVar.J()) {
            if (z4) {
                b60 b60VarN = sfaVar.n();
                String str3 = b60VarN != null ? b60VarN.f : null;
                if (str3 == null || str3.length() == 0) {
                    Locale locale = Locale.ENGLISH;
                    String string = context.getString(R.string.tt_audio);
                    long j = sfaVar.n().c;
                    String[] strArr = woh.b;
                    charSequenceH = String.format(locale, "%s %s", Arrays.copyOf(new Object[]{string, mxl.a(j)}, 2));
                } else {
                    charSequenceH = sfaVar.n().f;
                }
            } else {
                Locale locale2 = Locale.ENGLISH;
                String string2 = context.getString(R.string.tt_audio);
                long j2 = sfaVar.n().c;
                String[] strArr2 = woh.b;
                charSequenceH = String.format(locale2, "%s %s", Arrays.copyOf(new Object[]{string2, mxl.a(j2)}, 2));
            }
        } else if (sfaVar.P()) {
            j60 j60VarR = sfaVar.r();
            if (j60VarR != null) {
                charSequenceH = j60VarR.c;
            } else {
                charSequenceH = null;
            }
        } else if (sfaVar.L()) {
            f60 f60VarP = sfaVar.p();
            if (f60VarP != null) {
                charSequenceH = context.getString(R.string.attach_contact_reply, ((ih4) this.e.getValue()).d(f60VarP));
            } else {
                charSequenceH = null;
            }
        } else if (sfaVar.Q()) {
            charSequenceH = context.getString(R.string.tt_location);
        } else if (sfaVar.K()) {
            charSequenceH = woh.h(this.a, fdaVar.a, false, false, zedVar.a.t());
        } else {
            charSequenceH = null;
        }
        if (charSequenceH == null || charSequenceH.length() == 0) {
            return null;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        if (charSequenceH.length() == 0) {
            i = 3;
            charSequence = charSequenceH;
        } else {
            int i2 = sfaVar.J() ? 1 : sfaVar.L() ? 2 : 3;
            if (charSequenceH instanceof Spannable) {
                charSequenceH = lvb.d0(charSequenceH);
                Spannable spannable = charSequenceH instanceof Spannable ? (Spannable) charSequenceH : null;
                if (spannable != null) {
                    for (Object obj : spannable.getSpans(0, spannable.length(), gn9.class)) {
                        spannable.removeSpan((gn9) obj);
                    }
                }
            }
            charSequence = charSequenceH;
            i = i2;
        }
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return new roh(TypedValue.applyDimension(2, 14.0f, yl5.d().getDisplayMetrics()), charSequence, false, false, i, truncateAt, fdaVar, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
    }

    public final CharSequence c(CharSequence charSequence, boolean z) {
        String str = this.c;
        if (!z || !(charSequence instanceof Spannable)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        k9f[] k9fVarArr = (k9f[]) spannableString.getSpans(0, spannableString.length(), k9f.class);
        if (k9fVarArr.length == 0) {
            return charSequence;
        }
        for (k9f k9fVar : k9fVarArr) {
            try {
                ForegroundColorSpan foregroundColorSpan = k9fVar.a;
                if (foregroundColorSpan != null) {
                    spannableString.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = k9fVar.b;
                if (backgroundColorSpan != null) {
                    spannableString.removeSpan(backgroundColorSpan);
                }
                spannableString.removeSpan(k9fVar);
                gm0.U(str, "reformatText: remove search span");
            } catch (Throwable th) {
                gm0.V(str, "reformatText: could not remove search spans", th);
            }
        }
        return spannableString;
    }
}
