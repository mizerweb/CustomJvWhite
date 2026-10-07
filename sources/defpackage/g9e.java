package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g9e extends rne {
    public final String a;
    public final long b;
    public final u8e c;

    public g9e(String str, long j, u8e u8eVar) {
        this.a = str;
        this.b = j;
        this.c = u8eVar;
    }

    @Override // defpackage.rne
    public final y6a A() {
        String str = this.a;
        if (str != null) {
            Pattern pattern = y6a.c;
            try {
                return rx8.B(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.rne
    public final y41 E() {
        return this.c;
    }

    @Override // defpackage.rne
    public final long y() {
        return this.b;
    }
}
