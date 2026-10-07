package defpackage;

import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qol {
    public static void a(ViewGroup viewGroup) {
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        ore.m();
    }

    public static final ie4 b(kzi kziVar, String str, int i) {
        return new ie4(kziVar, str, i);
    }

    public static final ie4 c(kzi kziVar) {
        return new ie4(kziVar);
    }

    public static void d(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.transition_current_scene, null);
    }
}
