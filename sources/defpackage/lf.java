package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lf {
    public final Context a;
    public final nf b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public Button h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public NestedScrollView m;
    public Drawable n;
    public ImageView o;
    public TextView p;
    public TextView q;
    public View r;
    public ListAdapter s;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public final jf z;
    public boolean g = false;
    public int t = -1;
    public final x7 A = new x7(1, this);

    public lf(Context context, nf nfVar, Window window) {
        this.a = context;
        this.b = nfVar;
        this.c = window;
        jf jfVar = new jf();
        jfVar.b = new WeakReference(nfVar);
        this.z = jfVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, l3e.e, R.attr.alertDialogStyle, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.y = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        nfVar.e().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
