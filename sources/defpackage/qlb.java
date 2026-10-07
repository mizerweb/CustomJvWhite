package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class qlb {
    public String A;
    public String C;
    public final boolean F;
    public final Notification G;
    public boolean H;
    public final ArrayList I;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean m;
    public emb n;
    public CharSequence o;
    public int p;
    public int q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public String w;
    public Bundle x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean l = true;
    public boolean v = false;
    public int y = 0;
    public int z = 0;
    public int B = 0;
    public int D = 0;
    public int E = 0;

    public qlb(Context context, String str) {
        Notification notification = new Notification();
        this.G = notification;
        this.a = context;
        this.A = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.I = new ArrayList();
        this.F = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        vyh vyhVar = new vyh(this);
        qlb qlbVar = (qlb) vyhVar.e;
        emb embVar = qlbVar.n;
        if (embVar != null) {
            embVar.b(vyhVar);
        }
        Notification notificationBuild = ((Notification.Builder) vyhVar.d).build();
        if (embVar != null) {
            qlbVar.n.getClass();
        }
        if (embVar != null && (bundle = notificationBuild.extras) != null) {
            embVar.a(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        if (this.x == null) {
            this.x = new Bundle();
        }
        return this.x;
    }

    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void e(int i) {
        Notification notification = this.G;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void f(int i, boolean z) {
        Notification notification = this.G;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void g(Bitmap bitmap) {
        IconCompat iconCompatB;
        if (bitmap == null) {
            iconCompatB = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatB = IconCompat.b(bitmap);
        }
        this.i = iconCompatB;
    }

    public final void h(Uri uri) {
        Notification notification = this.G;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = plb.a(plb.d(plb.c(plb.b(), 4), 5));
    }

    public final void i(emb embVar) {
        if (this.n != embVar) {
            this.n = embVar;
            if (embVar == null || embVar.a == this) {
                return;
            }
            embVar.a = this;
            i(embVar);
        }
    }
}
