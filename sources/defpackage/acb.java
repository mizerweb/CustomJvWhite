package defpackage;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class acb {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
