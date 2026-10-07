package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class okl {
    public static final void a(View view) {
        View viewFindViewById;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.preview_blur_overlay);
        if (viewFindViewById2 != null) {
            ViewParent parent2 = viewFindViewById2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewFindViewById2);
            }
        }
        ViewGroup viewGroup3 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup3 == null || (viewFindViewById = viewGroup3.findViewById(R.id.preview_avatar_overlay)) == null) {
            return;
        }
        ku2 ku2Var = viewFindViewById instanceof ku2 ? (ku2) viewFindViewById : null;
        if (ku2Var != null) {
            ote oteVar = ku2Var.a;
            if (oteVar != null) {
                oteVar.setCallback(ku2Var.b);
            }
            ku2Var.a = null;
            ku2Var.b = null;
        }
        ViewParent parent3 = viewFindViewById.getParent();
        ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
        if (viewGroup4 != null) {
            viewGroup4.removeView(viewFindViewById);
        }
    }

    public static int b(PublicKey publicKey) {
        if (publicKey instanceof ECPublicKey) {
            return ((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize();
        }
        if (publicKey instanceof RSAPublicKey) {
            return ((RSAPublicKey) publicKey).getModulus().bitLength();
        }
        ore.p("Unsupported public key type: ".concat(publicKey.getClass().getName()));
        return 0;
    }
}
