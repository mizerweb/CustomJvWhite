package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class xo4 implements wo4, yo4 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public xo4(xo4 xo4Var) {
        ClipData clipData = xo4Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = xo4Var.c;
        qyj.j(i, "source", 0, 5);
        this.c = i;
        int i2 = xo4Var.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = xo4Var.e;
            this.f = xo4Var.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.yo4
    public ContentInfo a() {
        return null;
    }

    @Override // defpackage.wo4
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.wo4
    public zo4 build() {
        return new zo4(new xo4(this));
    }

    @Override // defpackage.yo4
    public Bundle getExtras() {
        return this.f;
    }

    @Override // defpackage.yo4
    public int getFlags() {
        return this.d;
    }

    @Override // defpackage.wo4
    public void i(ClipData clipData) {
        this.b = clipData;
    }

    @Override // defpackage.yo4
    public int q() {
        return this.c;
    }

    @Override // defpackage.yo4
    public ClipData r() {
        return this.b;
    }

    @Override // defpackage.wo4
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    @Override // defpackage.wo4
    public void setFlags(int i) {
        this.d = i;
    }

    @Override // defpackage.yo4
    public Uri t() {
        return this.e;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return zo5.w(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xo4() {
    }
}
