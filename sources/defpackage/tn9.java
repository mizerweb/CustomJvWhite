package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public final class tn9 {
    public final Matcher a;
    public final CharSequence b;
    public sn9 c;

    public tn9(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new sn9(this);
        }
        return this.c;
    }

    public final hj8 b() {
        Matcher matcher = this.a;
        return oc9.f0(matcher.start(), matcher.end());
    }

    public final String c() {
        return this.a.group();
    }

    public final tn9 d() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd <= charSequence.length()) {
            return pnl.a(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
