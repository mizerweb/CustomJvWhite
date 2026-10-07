package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c58 implements k79 {
    public final Uri a;
    public final long b = j4c.a;

    public c58(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c58) && this.a.equals(((c58) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(R.id.media_editor_aspect_ratio_image_view_type) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.media_editor_aspect_ratio_image_view_type;
    }

    public final String toString() {
        return "ImageAspectRatioModel(viewType=" + R.id.media_editor_aspect_ratio_image_view_type + ", imageUri=" + this.a + ")";
    }
}
