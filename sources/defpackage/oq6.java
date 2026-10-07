package defpackage;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.migration.Migration;

/* JADX INFO: loaded from: classes2.dex */
public final class oq6 implements j8e {
    public final String a;
    public final JsonDeserializer b;
    public final Migration c;
    public final CrashReporterRepository d;
    public final boolean e;
    public final boolean f;
    public final gu4 g;
    public volatile JsonSerializableFileDataStoreImpl h;

    public oq6(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, gu4 gu4Var) {
        this.a = str;
        this.b = jsonDeserializer;
        this.c = migration;
        this.d = crashReporterRepository;
        this.e = z;
        this.f = z2;
        this.g = gu4Var;
    }

    @Override // defpackage.j8e
    public final Object m(Object obj, zv8 zv8Var) {
        Context context = (Context) obj;
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new JsonSerializableFileDataStoreImpl(context, this.a, this.b, this.c, this.d, this.e, this.f, this.g, null, np0.n, null);
                }
            }
        }
        return this.h;
    }
}
