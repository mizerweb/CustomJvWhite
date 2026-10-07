package com.vk.push.core.filedatastore;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.migration.Migration;
import defpackage.av8;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.gu4;
import defpackage.gv7;
import defpackage.hu4;
import defpackage.ik5;
import defpackage.j95;
import defpackage.l9b;
import defpackage.lq4;
import defpackage.np0;
import defpackage.ore;
import defpackage.poe;
import defpackage.r5h;
import defpackage.roe;
import defpackage.t20;
import defpackage.ur8;
import defpackage.yab;
import defpackage.yu8;
import defpackage.zo5;
import defpackage.zu8;
import java.io.IOException;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B]\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u000e2\u0016\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/vk/push/core/filedatastore/JsonSerializableFileDataStoreImpl;", "Lcom/vk/push/core/filedatastore/JsonSerializer;", "T", "Lcom/vk/push/core/filedatastore/FileDataStore;", "Landroid/content/Context;", "context", "", "fileName", "Lcom/vk/push/core/filedatastore/JsonDeserializer;", "deserializer", "Lcom/vk/push/core/filedatastore/migration/Migration;", "migration", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashReporterRepository", "", "cacheOnError", "clearOnCorruption", "Lgu4;", "scope", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/filedatastore/JsonDeserializer;Lcom/vk/push/core/filedatastore/migration/Migration;Lcom/vk/push/core/data/repository/CrashReporterRepository;ZZLgu4;Lcom/vk/push/core/filedatastore/FileDataSource;)V", "data", "write", "(Lcom/vk/push/core/filedatastore/JsonSerializer;Llq4;)Ljava/lang/Object;", "read", "(Llq4;)Ljava/lang/Object;", "Lkotlin/Function1;", "transform", "edit", "(Lcf7;Llq4;)Ljava/lang/Object;", "clear", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonSerializableFileDataStoreImpl<T extends JsonSerializer> implements FileDataStore<T> {
    public final String a;
    public final JsonDeserializer b;
    public final Migration c;
    public final CrashReporterRepository d;
    public final boolean e;
    public final boolean f;
    public final gu4 g;
    public final FileDataSource h;
    public final l9b i;
    public volatile JsonSerializer j;

    public /* synthetic */ JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, gu4 gu4Var, FileDataSource fileDataSource, int i, j95 j95Var) {
        gu4 gu4Var2;
        FileDataSource fileDataSource2;
        if ((i & np0.n) != 0) {
            gu4Var2 = gu4Var;
            fileDataSource2 = new FileDataSource(context.getApplicationContext(), zo5.o(str, ".json"), gu4Var2);
        } else {
            gu4Var2 = gu4Var;
            fileDataSource2 = fileDataSource;
        }
        this(context, str, jsonDeserializer, migration, crashReporterRepository, z, z2, gu4Var2, fileDataSource2);
    }

    public static void a(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, Object obj, IssueKey issueKey) {
        if (!(obj instanceof poe)) {
            jsonSerializableFileDataStoreImpl.getClass();
            return;
        }
        CrashReporterRepository crashReporterRepository = jsonSerializableFileDataStoreImpl.d;
        Throwable thA = roe.a(obj);
        if (thA == null) {
            thA = new IOException("Unknown IOException");
        }
        crashReporterRepository.nonFatalReport(thA, issueKey);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: access$readUnsafe-IoAF18A */
    public static final Object m20access$readUnsafeIoAF18A(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, lq4 lq4Var) {
        zu8 zu8Var;
        Object objM18getDataIoAF18A;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2;
        Object poeVar;
        jsonSerializableFileDataStoreImpl.getClass();
        if (lq4Var instanceof zu8) {
            zu8Var = (zu8) lq4Var;
            int i = zu8Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zu8Var.h = i - Integer.MIN_VALUE;
            } else {
                zu8Var = new zu8(jsonSerializableFileDataStoreImpl, lq4Var);
            }
        } else {
            zu8Var = new zu8(jsonSerializableFileDataStoreImpl, lq4Var);
        }
        Object obj = zu8Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = zu8Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            JsonSerializer jsonSerializer = jsonSerializableFileDataStoreImpl.j;
            if (jsonSerializer != null) {
                return jsonSerializer;
            }
            FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
            zu8Var.d = jsonSerializableFileDataStoreImpl;
            zu8Var.e = jsonSerializableFileDataStoreImpl;
            zu8Var.h = 1;
            objM18getDataIoAF18A = fileDataSource.m18getDataIoAF18A(zu8Var);
            if (objM18getDataIoAF18A == hu4Var) {
                return hu4Var;
            }
            jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jsonSerializableFileDataStoreImpl = zu8Var.e;
            jsonSerializableFileDataStoreImpl2 = zu8Var.d;
            ch3.d0(obj);
            objM18getDataIoAF18A = ((roe) obj).a;
        }
        a(jsonSerializableFileDataStoreImpl, objM18getDataIoAF18A, IssueKey.FILE_DATA_STORE_READ_ERROR);
        Throwable thA = roe.a(objM18getDataIoAF18A);
        if (thA != null) {
            return new poe(new ReadException(thA, null, 2, null));
        }
        String str = (String) objM18getDataIoAF18A;
        jsonSerializableFileDataStoreImpl2.getClass();
        if (r5h.X0(str)) {
            return new poe(new NoValueException(null, 1, null));
        }
        try {
            Object objFromJson = jsonSerializableFileDataStoreImpl2.b.fromJson(new JSONObject(str));
            jsonSerializableFileDataStoreImpl2.j = (JsonSerializer) objFromJson;
            poeVar = (JsonSerializer) objFromJson;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        IssueKey issueKey = IssueKey.FILE_DATA_STORE_PARSE_ERROR;
        ik5 ik5Var = new ik5(1, jsonSerializableFileDataStoreImpl2);
        if (poeVar instanceof poe) {
            jsonSerializableFileDataStoreImpl2.d.nonFatalReport((Throwable) ik5Var.invoke(roe.a(poeVar)), issueKey);
        }
        Throwable thA2 = roe.a(poeVar);
        if (thA2 != null && jsonSerializableFileDataStoreImpl2.f && (thA2 instanceof JSONException)) {
            yab.i0(jsonSerializableFileDataStoreImpl2.g, null, 0, new ur8(jsonSerializableFileDataStoreImpl2, null, 2), 3);
        }
        return poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: access$writeUnsafe-gIAlu-s */
    public static final Object m21access$writeUnsafegIAlus(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, JsonSerializer jsonSerializer, lq4 lq4Var) {
        av8 av8Var;
        Object poeVar;
        Object objM19setDatagIAlus;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2;
        jsonSerializableFileDataStoreImpl.getClass();
        if (lq4Var instanceof av8) {
            av8Var = (av8) lq4Var;
            int i = av8Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                av8Var.i = i - Integer.MIN_VALUE;
            } else {
                av8Var = new av8(jsonSerializableFileDataStoreImpl, lq4Var);
            }
        } else {
            av8Var = new av8(jsonSerializableFileDataStoreImpl, lq4Var);
        }
        Object obj = av8Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = av8Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            try {
                poeVar = jsonSerializer.toJson();
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                return new poe(new WriteException(thA, null, 2, null));
            }
            FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
            String string = ((JSONObject) poeVar).toString();
            av8Var.d = jsonSerializableFileDataStoreImpl;
            av8Var.e = jsonSerializer;
            av8Var.f = jsonSerializableFileDataStoreImpl;
            av8Var.i = 1;
            objM19setDatagIAlus = fileDataSource.m19setDatagIAlus(string, av8Var);
            if (objM19setDatagIAlus == hu4Var) {
                return hu4Var;
            }
            jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jsonSerializableFileDataStoreImpl = av8Var.f;
            jsonSerializer = av8Var.e;
            jsonSerializableFileDataStoreImpl2 = av8Var.d;
            ch3.d0(obj);
            objM19setDatagIAlus = ((roe) obj).a;
        }
        a(jsonSerializableFileDataStoreImpl, objM19setDatagIAlus, IssueKey.FILE_DATA_STORE_WRITE_ERROR);
        if (!(objM19setDatagIAlus instanceof poe)) {
            jsonSerializableFileDataStoreImpl2.j = jsonSerializer;
        }
        return objM19setDatagIAlus;
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object clear(lq4 lq4Var) {
        return yab.K0(this.g.k(), new yu8(this, null, 0), lq4Var);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object edit(cf7 cf7Var, lq4 lq4Var) {
        return yab.K0(this.g.k(), new t20(this, cf7Var, (lq4) null, 20), lq4Var);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object read(lq4 lq4Var) {
        return yab.K0(this.g.k(), new yu8(this, null, 1), lq4Var);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object write(T t, lq4 lq4Var) {
        return yab.K0(this.g.k(), new t20(this, t, (lq4) null, 21), lq4Var);
    }

    public JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, gu4 gu4Var, FileDataSource fileDataSource) {
        this.a = str;
        this.b = jsonDeserializer;
        this.c = migration;
        this.d = crashReporterRepository;
        this.e = z;
        this.f = z2;
        this.g = gu4Var;
        this.h = fileDataSource;
        this.i = new l9b();
        yab.i0(gu4Var, null, 0, new gv7(this, context.getApplicationContext(), null, 7), 3);
    }
}
