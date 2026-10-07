package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k6g {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static j6g a(File file, ez8 ez8Var, r95 r95Var) throws Cache$CacheException {
        ConcurrentHashMap concurrentHashMap = a;
        j6g j6gVar = (j6g) concurrentHashMap.get(file);
        if (j6gVar != null) {
            j6gVar.d();
            return j6gVar;
        }
        j6g j6gVar2 = new j6g(file, ez8Var, r95Var, false);
        try {
            j6gVar2.d();
            concurrentHashMap.put(file, j6gVar2);
            return j6gVar2;
        } catch (Cache$CacheException e) {
            j6gVar2.l();
            throw e;
        }
    }

    public static void b(File file, r95 r95Var) {
        j6g j6gVar = (j6g) a.remove(file);
        if (j6gVar != null) {
            j6gVar.l();
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    file.delete();
                    return;
                }
                long jK = j6g.k(fileArrListFiles);
                if (jK != -1) {
                    try {
                        String hexString = Long.toHexString(jK);
                        try {
                            String str = "ExoPlayerCacheFileMetadata" + hexString;
                            SQLiteDatabase writableDatabase = r95Var.a.getWritableDatabase();
                            writableDatabase.beginTransactionNonExclusive();
                            try {
                                usi.b(writableDatabase, 2, hexString);
                                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } catch (Throwable th) {
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        } catch (SQLException e) {
                            throw new DatabaseIOException((Throwable) e);
                        }
                    } catch (DatabaseIOException unused) {
                        lvb.G0("SimpleCache", "Failed to delete file metadata: " + jK);
                    }
                    try {
                        gvb.k(r95Var, Long.toHexString(jK));
                    } catch (DatabaseIOException unused2) {
                        lvb.G0("SimpleCache", "Failed to delete file metadata: " + jK);
                    }
                }
                vqi.e0(file);
            }
        }
    }
}
