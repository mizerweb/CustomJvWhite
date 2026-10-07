package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ph implements v3f {
    public final Context b;
    public final poc c;
    public final lz8 d;
    public final ifh e = new ifh(new d2(2, this));

    public ph(Context context, poc pocVar, lz8 lz8Var) {
        this.b = context;
        this.c = pocVar;
        this.d = lz8Var;
    }

    @Override // defpackage.v3f
    public final Uri b(w3f w3fVar, String str) {
        String strI = w3fVar.i();
        sya syaVarA = w3fVar.a();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        File file = new File(strI, "MAX");
        ContentValues contentValuesA = ipl.a(new ylc("_display_name", str), new ylc("mime_type", syaVarA.a), new ylc("date_added", Long.valueOf(jCurrentTimeMillis)), new ylc("date_modified", Long.valueOf(jCurrentTimeMillis)), new ylc("relative_path", file + File.separator));
        Integer numJ = w3fVar.j();
        if (numJ != null) {
            contentValuesA.put("_size", Integer.valueOf(numJ.intValue()));
        }
        Integer width = w3fVar.getWidth();
        if (width != null) {
            contentValuesA.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = w3fVar.getHeight();
        if (height != null) {
            contentValuesA.put("height", Integer.valueOf(height.intValue()));
        }
        contentValuesA.put("is_pending", (Integer) 1);
        ifh ifhVar = this.e;
        Uri uriInsert = ((ContentResolver) ifhVar.getValue()).insert(w3fVar.f(), contentValuesA);
        if (uriInsert == null) {
            gm0.Y(ph.class.getName(), "Early return in saveMediaToGallery cuz of contentResolver.insert(scopedWriter.mediaCollectionUri, contentValues) is null");
            return null;
        }
        w3fVar.b((ContentResolver) ifhVar.getValue(), uriInsert);
        contentValuesA.clear();
        contentValuesA.put("is_pending", (Integer) 0);
        ((ContentResolver) ifhVar.getValue()).update(uriInsert, contentValuesA, null, null);
        v3f.a(this.b, uriInsert);
        return uriInsert;
    }

    @Override // defpackage.v3f
    public final Uri c(w3f w3fVar, String str) {
        poc pocVar = this.c;
        File file = new File(pocVar.a(), str);
        w3fVar.l(file);
        Context context = pocVar.a;
        return FileProvider.c(0, context, context.getPackageName() + ".provider").c(file);
    }

    @Override // defpackage.v3f
    public final lz8 e() {
        return this.d;
    }
}
