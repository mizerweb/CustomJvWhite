package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getFileToMigrate", "Ljava/io/File;", "Landroid/content/Context;", "preferenceName", "", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DataStoreMigrationKt {
    public static final File getFileToMigrate(Context context, String str) {
        return new File(context.getFilesDir().getPath() + "/datastore/" + str + ".preferences_pb");
    }
}
