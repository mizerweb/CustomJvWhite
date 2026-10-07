package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import com.vk.push.common.utils.FileExtensionKt;
import defpackage.b35;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.e9i;
import defpackage.eoc;
import defpackage.ewd;
import defpackage.ex8;
import defpackage.hu4;
import defpackage.ikl;
import defpackage.j95;
import defpackage.lq4;
import defpackage.ore;
import defpackage.poe;
import defpackage.rl0;
import defpackage.udd;
import defpackage.x8b;
import defpackage.xx6;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B7\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00112\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lcom/vk/push/core/filedatastore/migration/PreferenceDataStoreMigration;", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "Lb35;", "Lx8b;", "dataStoreInstance", "", "preferenceName", "Lkotlin/Function1;", "transform", "<init>", "(Lb35;Ljava/lang/String;Lcf7;)V", "Landroid/content/Context;", "context", "", "shouldMigrate", "(Landroid/content/Context;Llq4;)Ljava/lang/Object;", "Lroe;", "migrate-gIAlu-s", "migrate", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PreferenceDataStoreMigration<T> implements Migration<T> {
    public static final /* synthetic */ zv8[] e;
    public final b35 a;
    public final String b;
    public final cf7 c;
    public final eoc d;

    static {
        ewd ewdVar = new ewd(PreferenceDataStoreMigration.class, "preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        zfe.a.getClass();
        e = new zv8[]{ewdVar};
    }

    public PreferenceDataStoreMigration(b35 b35Var, String str, cf7 cf7Var) {
        this.a = b35Var;
        this.b = str;
        this.c = cf7Var;
        this.d = ikl.c(str, new ex8(26, rl0.l));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(PreferenceDataStoreMigration preferenceDataStoreMigration, Context context, lq4 lq4Var) {
        udd uddVar;
        if (lq4Var instanceof udd) {
            uddVar = (udd) lq4Var;
            int i = uddVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uddVar.h = i - Integer.MIN_VALUE;
            } else {
                uddVar = new udd(preferenceDataStoreMigration, lq4Var);
            }
        } else {
            uddVar = new udd(preferenceDataStoreMigration, lq4Var);
        }
        Object objN = uddVar.f;
        int i2 = uddVar.h;
        try {
            if (i2 == 0) {
                ch3.d0(objN);
                b35 b35Var = preferenceDataStoreMigration.a;
                if (b35Var == null) {
                    b35Var = (b35) preferenceDataStoreMigration.d.m(context, e[0]);
                }
                xx6 data = b35Var.getData();
                uddVar.d = context;
                uddVar.e = preferenceDataStoreMigration;
                uddVar.h = 1;
                objN = e9i.N(data, uddVar);
                hu4 hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                preferenceDataStoreMigration = uddVar.e;
                context = uddVar.d;
                ch3.d0(objN);
            }
            Object objInvoke = preferenceDataStoreMigration.c.invoke((x8b) objN);
            DataStoreMigrationKt.getFileToMigrate(context, preferenceDataStoreMigration.b).delete();
            return objInvoke;
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    /* JADX INFO: renamed from: migrate-gIAlu-s */
    public Object mo22migrategIAlus(Context context, lq4 lq4Var) {
        return a(this, context, lq4Var);
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, lq4 lq4Var) {
        return Boolean.valueOf(FileExtensionKt.existsSafe(DataStoreMigrationKt.getFileToMigrate(context, this.b)));
    }

    public /* synthetic */ PreferenceDataStoreMigration(b35 b35Var, String str, cf7 cf7Var, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : b35Var, str, cf7Var);
    }
}
