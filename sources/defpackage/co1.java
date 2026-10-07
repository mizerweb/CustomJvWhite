package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class co1 {
    public final Context a;
    public final ny8 b = rx8.P(3, new yk1(2, this));

    public co1(Context context) {
        this.a = context;
    }

    public final tj0 a(CharSequence charSequence, Long l) {
        if (charSequence == null) {
            charSequence = "";
        }
        return gm0.a(String.valueOf(new xnh(charSequence).b(this.a)), l);
    }

    public final xnh b(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return ynh.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v3e.c(charSequence.toString()));
        spannableStringBuilder.setSpan(new fqh(pq3.j.e(this.a).m(), new m(23, this)), 0, spannableStringBuilder.length(), 17);
        return new xnh(spannableStringBuilder);
    }
}
