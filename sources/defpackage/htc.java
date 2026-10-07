package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class htc {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public boolean d;

    public final r70 a() {
        r70 r70Var = new r70();
        r70Var.b = this.a;
        r70Var.c = this.b;
        r70Var.d = this.c;
        r70Var.a = this.d;
        return r70Var;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(SdkMetricStatEvent.NAME_KEY, this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    ore.p("Invalid icon");
                    return null;
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle.putInt("type", iconCompat.a);
            bundle.putInt("int1", iconCompat.e);
            bundle.putInt("int2", iconCompat.f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", null);
        bundle2.putString("key", this.c);
        bundle2.putBoolean("isBot", false);
        bundle2.putBoolean("isImportant", this.d);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof htc)) {
            return false;
        }
        htc htcVar = (htc) obj;
        String str = this.c;
        String str2 = htcVar.c;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (!Objects.equals(Objects.toString(this.a), Objects.toString(htcVar.a))) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Boolean.valueOf(this.d).equals(Boolean.valueOf(htcVar.d));
    }

    public final int hashCode() {
        String str = this.c;
        return str != null ? str.hashCode() : Objects.hash(this.a, null, Boolean.FALSE, Boolean.valueOf(this.d));
    }
}
