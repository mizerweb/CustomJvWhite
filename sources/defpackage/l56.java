package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l56 implements w46 {
    public final i56 a;
    public final Context b;
    public final yt4 c;
    public final pzf d;
    public final xx6 e;
    public final ifh f;
    public final ConcurrentHashMap g;

    public l56(yt4 yt4Var, i56 i56Var, ny8 ny8Var, Context context) {
        this.a = i56Var;
        this.b = context;
        this.c = yt4Var;
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.d = pzfVarB;
        this.e = e9i.F(new q8e(pzfVarB), 100L);
        this.f = new ifh(new x5(this, 11, ny8Var));
        this.g = new ConcurrentHashMap(26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(View view) {
        if (view == 0 || view.getVisibility() != 0) {
            return;
        }
        if (view instanceof r46) {
            ((r46) view).g();
            return;
        }
        geg[] gegVarArr = null;
        spans = null;
        Object[] spans = null;
        int i = 0;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    lfe lfeVarS = recyclerView.S(childAt);
                    r46 r46Var = lfeVarS instanceof r46 ? (r46) lfeVarS : null;
                    if (r46Var == null) {
                        c(childAt);
                    } else {
                        r46Var.g();
                    }
                }
                i++;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount2 = viewGroup.getChildCount();
            while (i < childCount2) {
                c(viewGroup.getChildAt(i));
                i++;
            }
            return;
        }
        if (view instanceof EditText) {
            ((EditText) view).requestLayout();
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                int length = text.length();
                try {
                    Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, geg.class);
                    }
                } catch (Throwable unused) {
                }
                gegVarArr = (geg[]) spans;
            }
            if (gegVarArr == null) {
                return;
            }
            int length2 = gegVarArr.length;
            while (i < length2) {
                if (gegVarArr[i].b() instanceof kfg) {
                    textView.invalidate();
                }
                i++;
            }
        }
    }

    @Override // defpackage.w46
    public final xx6 a() {
        return this.e;
    }

    @Override // defpackage.w46
    public final void b(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        c(viewFindViewById);
    }
}
