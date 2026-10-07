package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class taf implements vaf {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public taf(long j, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = j >= 0 ? -j : j;
    }

    @Override // defpackage.vaf
    public final int a() {
        return 0;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.h;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.oneme_stickers_settings_set_view_type;
    }
}
