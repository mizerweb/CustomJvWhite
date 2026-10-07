package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.LruCache;
import com.vk.push.core.data.repository.CrashSenderImpl;
import com.vk.push.core.data.repository.IssueKey;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import one.me.contactlist.ContactListWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class vk4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.g = obj3;
        this.j = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fd A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0203  */
    /* JADX WARN: Code duplicated, block: B:103:0x0204 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:112:0x023c A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:110:0x0236, B:112:0x023c, B:116:0x0244), top: B:126:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0243  */
    /* JADX WARN: Code duplicated, block: B:121:0x0255  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[Catch: Exception -> 0x0021, all -> 0x0234, TRY_LEAVE, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: Exception -> 0x0021, all -> 0x0234, TRY_ENTER, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013e A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0142 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0162 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x016a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x017e A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0182 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x019e A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01db A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01df A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9 A[Catch: Exception -> 0x0021, all -> 0x0234, TryCatch #2 {all -> 0x0234, blocks: (B:7:0x001c, B:35:0x00a2, B:37:0x00a8, B:40:0x00b2, B:106:0x021e, B:107:0x0233, B:43:0x00bd, B:44:0x00d4, B:46:0x00d8, B:49:0x00e5, B:50:0x00fe, B:52:0x0102, B:55:0x010a, B:56:0x011e, B:58:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0142, B:67:0x014a, B:68:0x015e, B:70:0x0162, B:73:0x016a, B:74:0x017e, B:76:0x0182, B:79:0x018a, B:80:0x019e, B:82:0x01a2, B:85:0x01aa, B:86:0x01bd, B:88:0x01c1, B:91:0x01c8, B:92:0x01db, B:94:0x01df, B:97:0x01e6, B:98:0x01f9, B:100:0x01fd, B:103:0x0204, B:105:0x021a, B:14:0x002f, B:22:0x007a, B:24:0x007e, B:19:0x0064), top: B:128:0x000e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0204, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00e5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x010a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x012a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x016a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x018a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x01c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01e6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj) throws Exception {
        File fileT;
        Object objT;
        Exception e;
        File file;
        Bitmap bitmap;
        Object poeVar;
        Object obj2;
        boolean zDelete;
        String string;
        Uri uri = (Uri) this.j;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                fileT = ((ju6) ((rs6) ((iz5) this.g).f.getValue())).t(System.currentTimeMillis() + ".jpg");
                try {
                    b78 b78VarA = vd7.A();
                    us5 us5Var = new us5(3);
                    this.h = fileT;
                    this.f = 1;
                    objT = vd7.t(b78VarA, uri, us5Var, this, 6);
                    if (objT == hu4Var) {
                    }
                    return hu4Var;
                } catch (Exception e2) {
                    File file2 = fileT;
                    e = e2;
                    file = file2;
                    if (file.exists()) {
                        zDelete = file.delete();
                    } else {
                        zDelete = false;
                    }
                    poeVar = Boolean.valueOf(zDelete);
                    obj2 = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj2;
                    }
                    throw e;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bitmap = (Bitmap) this.i;
                file = (File) this.h;
                try {
                    ch3.d0(obj);
                    if (bitmap != null) {
                        rel.b(bitmap);
                        return file;
                    }
                    if (gm0.c()) {
                        string = uri.toString();
                    } else {
                        string = "[]";
                        if (uri instanceof Collection) {
                            if (((Collection) uri).isEmpty()) {
                                string = "[**" + ((Collection) uri).size() + "**]";
                            }
                        } else if (uri instanceof Map) {
                            if (((Map) uri).isEmpty()) {
                                string = "{}";
                            } else {
                                string = "{**" + ((Map) uri).size() + "**}";
                            }
                        } else if (uri instanceof Object[]) {
                            if (((Object[]) uri).length == 0) {
                                string = "[**" + ((Object[]) uri).length + "**]";
                            }
                        } else if (uri instanceof int[]) {
                            if (((int[]) uri).length == 0) {
                                string = "[**" + ((int[]) uri).length + "**]";
                            }
                        } else if (uri instanceof float[]) {
                            if (((float[]) uri).length == 0) {
                                string = "[**" + ((float[]) uri).length + "**]";
                            }
                        } else if (uri instanceof long[]) {
                            if (((long[]) uri).length == 0) {
                                string = "[**" + ((long[]) uri).length + "**]";
                            }
                        } else if (uri instanceof double[]) {
                            if (((double[]) uri).length == 0) {
                                string = "[**" + ((double[]) uri).length + "**]";
                            }
                        } else if (uri instanceof short[]) {
                            if (((short[]) uri).length == 0) {
                                string = "[**" + ((short[]) uri).length + "**]";
                            }
                        } else if (uri instanceof byte[]) {
                            if (((byte[]) uri).length == 0) {
                                string = "[**" + ((byte[]) uri).length + "**]";
                            }
                        } else if (uri instanceof char[]) {
                            if (((char[]) uri).length == 0) {
                                string = "[**" + ((char[]) uri).length + "**]";
                            }
                        } else if (uri instanceof boolean[]) {
                            string = "***";
                        } else if (((boolean[]) uri).length == 0) {
                            string = "[**" + ((boolean[]) uri).length + "**]";
                        }
                    }
                    throw new IllegalStateException(("fetchBitmap returned null for " + string).toString());
                } catch (Exception e3) {
                    e = e3;
                    try {
                        if (file.exists()) {
                            zDelete = file.delete();
                        } else {
                            zDelete = false;
                        }
                        poeVar = Boolean.valueOf(zDelete);
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    obj2 = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj2;
                    }
                    throw e;
                }
            }
            File file3 = (File) this.h;
            try {
                ch3.d0(obj);
                objT = obj;
                fileT = file3;
            } catch (Exception e4) {
                e = e4;
                file = file3;
                if (file.exists()) {
                    zDelete = file.delete();
                } else {
                    zDelete = false;
                }
                poeVar = Boolean.valueOf(zDelete);
                obj2 = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj2;
                }
                throw e;
            }
            bitmap = (Bitmap) objT;
            if (bitmap != null) {
                dx4 dx4Var = new dx4(fileT, 4, bitmap);
                this.h = fileT;
                this.i = bitmap;
                this.f = 2;
                if (qyj.V(k66.a, dx4Var, this) != hu4Var) {
                    file = fileT;
                    if (bitmap != null) {
                        rel.b(bitmap);
                        return file;
                    }
                }
                return hu4Var;
            }
            file = fileT;
            if (gm0.c()) {
                string = "[]";
                if (uri instanceof Collection) {
                    if (((Collection) uri).isEmpty()) {
                        string = "[**" + ((Collection) uri).size() + "**]";
                    }
                } else if (uri instanceof Map) {
                    if (((Map) uri).isEmpty()) {
                        string = "{}";
                    } else {
                        string = "{**" + ((Map) uri).size() + "**}";
                    }
                } else if (uri instanceof Object[]) {
                    if (((Object[]) uri).length == 0) {
                        string = "[**" + ((Object[]) uri).length + "**]";
                    }
                } else if (uri instanceof int[]) {
                    if (((int[]) uri).length == 0) {
                        string = "[**" + ((int[]) uri).length + "**]";
                    }
                } else if (uri instanceof float[]) {
                    if (((float[]) uri).length == 0) {
                        string = "[**" + ((float[]) uri).length + "**]";
                    }
                } else if (uri instanceof long[]) {
                    if (((long[]) uri).length == 0) {
                        string = "[**" + ((long[]) uri).length + "**]";
                    }
                } else if (uri instanceof double[]) {
                    if (((double[]) uri).length == 0) {
                        string = "[**" + ((double[]) uri).length + "**]";
                    }
                } else if (uri instanceof short[]) {
                    if (((short[]) uri).length == 0) {
                        string = "[**" + ((short[]) uri).length + "**]";
                    }
                } else if (uri instanceof byte[]) {
                    if (((byte[]) uri).length == 0) {
                        string = "[**" + ((byte[]) uri).length + "**]";
                    }
                } else if (uri instanceof char[]) {
                    if (((char[]) uri).length == 0) {
                        string = "[**" + ((char[]) uri).length + "**]";
                    }
                } else if (uri instanceof boolean[]) {
                    string = "***";
                } else if (((boolean[]) uri).length == 0) {
                    string = "[**" + ((boolean[]) uri).length + "**]";
                }
            } else {
                string = uri.toString();
            }
            throw new IllegalStateException(("fetchBitmap returned null for " + string).toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final Object n(Object obj) {
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            String str = ((c27) this.h).a;
            String str2 = (String) this.i;
            m8b m8bVar = (m8b) this.g;
            Set set = (Set) this.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    if (!gm0.c()) {
                        str2 = "*****";
                    }
                    a4cVar.c(je9Var, str, "Creating custom folder with title=" + str2 + " and included=" + m8bVar + ", filters:" + set, null);
                }
            }
            ((sy4) ((c27) this.h).d.getValue()).getClass();
            o67 o67Var = new o67(UUID.randomUUID().toString(), (String) this.i, (m8b) this.g, null, (Set) this.j, null, 84);
            c27 c27Var = (c27) this.h;
            this.f = 1;
            if (c27.a(c27Var, o67Var, this) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object o(Object obj) {
        pw pwVar;
        d67 d67Var = (d67) this.i;
        AtomicReference atomicReference = d67Var.n;
        mjg mjgVar = d67Var.o;
        mjg mjgVar2 = d67Var.h;
        List list = (List) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i == 0) {
            ch3.d0(obj);
            int size = list.size();
            String str = "all.chat.folder";
            hu4 hu4Var = hu4.a;
            if (size == 1 && cqk.d(((r17) ww3.r1(list)).a, "all.chat.folder")) {
                this.g = null;
                this.f = 1;
                mjgVar2.getClass();
                mjgVar2.j(null, r66.a);
                if (sbiVar != hu4Var) {
                    return sbiVar;
                }
            } else {
                pw pwVar2 = new pw((Collection) mjgVar.getValue());
                List list2 = list;
                ny8 ny8Var = (ny8) this.j;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r17 r17Var = (r17) it.next();
                    boolean zD = cqk.d(r17Var.a, str);
                    if (!zD && d67.C(r17Var, d67Var.c)) {
                        pwVar2.add(r17Var.a);
                    }
                    arrayList.add(new zmi(r17Var, !zD ? ymi.b : ymi.a, new xnh(((o4c) ny8Var.getValue()).a(r17Var.b, r17Var.f, 2, false, 0, true, false))));
                    it = it;
                    str = str;
                    ny8Var = ny8Var;
                }
                if (((Set) atomicReference.get()) == null) {
                    atomicReference.updateAndGet(new pa1(list, 3, d67Var));
                }
                this.g = null;
                this.h = pwVar2;
                this.f = 2;
                mjgVar2.getClass();
                mjgVar2.j(null, arrayList);
                if (sbiVar != hu4Var) {
                    pwVar = pwVar2;
                }
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i != 2) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pwVar = (pw) this.h;
        ch3.d0(obj);
        mjgVar.setValue(pwVar);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    private final Object p(Object obj) {
        List list;
        ob9 ob9Var;
        List list2;
        Collection collection;
        nh7 nh7Var = (nh7) this.j;
        ej7 ej7Var = (ej7) this.g;
        mjg mjgVar = ej7Var.n;
        rb8 rb8Var = ej7Var.f;
        mjg mjgVar2 = ej7Var.q;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            if (!((Boolean) mjgVar2.getValue()).booleanValue()) {
                gm0.n("ej7", "start fetch medias for " + nh7Var);
                Boolean bool = Boolean.TRUE;
                mjgVar2.getClass();
                mjgVar2.j(null, bool);
                List list3 = (List) rb8Var.q.get(nh7Var.a);
                if (list3 == null) {
                    list3 = r66.a;
                }
                this.f = 1;
                obj = ej7.B(ej7Var, list3, this);
                if (obj != hu4Var) {
                }
                return hu4Var;
            }
            return sbiVar;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i == 2) {
                list = (List) this.h;
                ch3.d0(obj);
                ob9Var = (ob9) obj;
                Boolean bool2 = Boolean.FALSE;
                mjgVar2.getClass();
                mjgVar2.j(null, bool2);
                if (!(ob9Var instanceof mb9)) {
                    if (ob9Var instanceof nb9) {
                        ore.o();
                        return null;
                    }
                    list2 = list;
                    List list4 = ((nb9) ob9Var).a;
                    this.h = null;
                    this.i = list2;
                    this.f = 3;
                    obj = ej7.B(ej7Var, list4, this);
                    if (obj != hu4Var) {
                        collection = list2;
                    }
                    return hu4Var;
                }
                return sbiVar;
            }
            if (i != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.i;
            ch3.d0(obj);
        }
        ArrayList arrayListG1 = ww3.G1((Iterable) obj, collection);
        gm0.n("ej7", "finish fetch medias for " + nh7Var);
        mjgVar.getClass();
        mjgVar.j(null, arrayListG1);
        return sbiVar;
        List list5 = (List) obj;
        mjgVar.setValue(list5);
        int i2 = ej7Var.p.b;
        this.h = list5;
        this.f = 2;
        Object objK0 = yab.K0(((n0c) rb8Var.d).b(), new fb8(nh7Var, i2, rb8Var, null), this);
        if (objK0 != hu4Var) {
            list = list5;
            obj = objK0;
            ob9Var = (ob9) obj;
            Boolean bool3 = Boolean.FALSE;
            mjgVar2.getClass();
            mjgVar2.j(null, bool3);
            if (!(ob9Var instanceof mb9)) {
                if (ob9Var instanceof nb9) {
                    ore.o();
                    return null;
                }
                list2 = list;
                List list6 = ((nb9) ob9Var).a;
                this.h = null;
                this.i = list2;
                this.f = 3;
                obj = ej7.B(ej7Var, list6, this);
                if (obj != hu4Var) {
                    collection = list2;
                    ArrayList arrayListG2 = ww3.G1((Iterable) obj, collection);
                    gm0.n("ej7", "finish fetch medias for " + nh7Var);
                    mjgVar.getClass();
                    mjgVar.j(null, arrayListG2);
                    return sbiVar;
                }
            }
            return sbiVar;
        }
        return hu4Var;
    }

    private final Object q(Object obj) {
        px8 px8Var;
        ConcurrentHashMap concurrentHashMap;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            String str = rb8.u;
            px8 px8Var2 = new px8("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List list = gh7.b;
            rb8 rb8Var = (rb8) this.j;
            ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.i0(gu4Var, ((n0c) rb8Var.d).b(), 0, new m34(1, null, (gh7) it.next(), rb8Var, px8Var2, concurrentHashMap2), 2));
            }
            this.g = null;
            this.h = px8Var2;
            this.i = concurrentHashMap2;
            this.f = 1;
            Object objU = ch3.u(arrayList, this);
            hu4 hu4Var = hu4.a;
            if (objU == hu4Var) {
                return hu4Var;
            }
            px8Var = px8Var2;
            concurrentHashMap = concurrentHashMap2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            concurrentHashMap = (ConcurrentHashMap) this.i;
            px8Var = (px8) this.h;
            ch3.d0(obj);
        }
        px8Var.getClass();
        return ww3.T1(concurrentHashMap.values());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:120:0x022a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0242  */
    /* JADX WARN: Code duplicated, block: B:129:0x0246  */
    /* JADX WARN: Code duplicated, block: B:134:0x0267  */
    /* JADX WARN: Code duplicated, block: B:136:0x026b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0297  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[PHI: r10
  0x0102: PHI (r10v21 ge8) = (r10v5 ge8), (r10v5 ge8), (r10v22 ge8) binds: [B:45:0x00d8, B:47:0x00de, B:53:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b0  */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        if (defpackage.bf8.j(r1, r10, r19) == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0287, code lost:
    
        if (defpackage.bf8.j(r1, r10, r19) == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        if (defpackage.bf8.j(r1, r10, r19) == r4) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk4.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        Throwable th;
        m29 m29Var;
        fmg fmgVar = (fmg) this.g;
        m29 m29Var2 = (m29) this.i;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                try {
                    bq bqVar = m29Var2.e;
                    ceh cehVar = (ceh) (bqVar != null ? bqVar : null).p.getValue();
                    List listSingletonList = Collections.singletonList(fmgVar);
                    this.h = m29Var2;
                    this.f = 1;
                    Object objG = cehVar.g(listSingletonList, this);
                    hu4 hu4Var = hu4.a;
                    if (objG == hu4Var) {
                        return hu4Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m29Var = m29Var2;
                    gm0.V(m29Var.g, "failed to store sticker set", th);
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m29Var = (m29) this.h;
                try {
                    ch3.d0(obj);
                } catch (Throwable th3) {
                    th = th3;
                    gm0.V(m29Var.g, "failed to store sticker set", th);
                }
            }
            m29Var2.o().c(new o29(m29Var2.a, null, -1L, null, null, null, new Long(fmgVar.a), (String) this.j));
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object t(Object obj) {
        tri triVar;
        tri triVar2;
        Context context = (Context) this.j;
        u99 u99Var = (u99) this.i;
        hm0 hm0Var = (hm0) this.g;
        int i = this.f;
        geh gehVar = null;
        if (i == 0) {
            ch3.d0(obj);
            u99Var.getClass();
            ny8 ny8Var = u99Var.b;
            LruCache lruCache = jph.a;
            Drawable drawable = (Drawable) jph.a.get(hm0Var);
            if (drawable != null) {
                return drawable;
            }
            triVar = (tri) ((cm0) ny8Var.getValue()).c(context, hm0Var).get(hm0Var);
            if (triVar == null) {
                return null;
            }
            sri sriVar = triVar.a;
            if (sriVar != null) {
                cm0 cm0Var = (cm0) ny8Var.getValue();
                this.h = triVar;
                this.f = 1;
                obj = cm0Var.d(context, sriVar, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
                triVar2 = triVar;
            }
            return new oph(sb8.q0(triVar, gehVar), false);
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        triVar2 = (tri) this.h;
        ch3.d0(obj);
        gehVar = (geh) obj;
        triVar = triVar2;
        return new oph(sb8.q0(triVar, gehVar), false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0 A[RETURN] */
    private final Object u(Object obj) {
        hm0 hm0Var;
        tri triVar;
        geh gehVar;
        sri sriVar;
        hm0 hm0Var2;
        Context context = (Context) this.j;
        v99 v99Var = (v99) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            Context context2 = v99Var.a;
            ny8 ny8Var = v99Var.b;
            a8g a8gVar = pq3.j;
            hm0Var = new hm0(a8gVar.e(context2).n() ? a8gVar.e(context2).j().c.concat("Dark") : a8gVar.e(context2).j().c.concat("Light"));
            LruCache lruCache = jph.a;
            Drawable drawable = (Drawable) jph.a.get(hm0Var);
            if (drawable != null) {
                gm0.n("LoadThemeBackgroundUseCase", "Load theme " + hm0Var + " from cache.");
                return drawable;
            }
            gm0.n("LoadThemeBackgroundUseCase", "Theme " + hm0Var + " not cached, start loading from source.");
            tri triVar2 = (tri) ((cm0) ny8Var.getValue()).c(context, null).get(hm0Var);
            if (triVar2 == null || (sriVar = triVar2.a) == null) {
                triVar = triVar2;
                gehVar = null;
            } else {
                cm0 cm0Var = (cm0) ny8Var.getValue();
                this.h = hm0Var;
                this.i = triVar2;
                this.f = 1;
                Object objD = cm0Var.d(context, sriVar, this);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
                triVar = triVar2;
                obj = objD;
                hm0Var2 = hm0Var;
            }
            if (triVar != null) {
                return null;
            }
            oph ophVar = new oph(sb8.q0(triVar, gehVar), false);
            v99Var.getClass();
            LruCache lruCache2 = jph.a;
            jph.a(hm0Var, ophVar);
            return ophVar;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        triVar = (tri) this.i;
        hm0Var2 = (hm0) this.h;
        ch3.d0(obj);
        gehVar = (geh) obj;
        hm0Var = hm0Var2;
        if (triVar != null) {
            return null;
        }
        oph ophVar2 = new oph(sb8.q0(triVar, gehVar), false);
        v99Var.getClass();
        LruCache lruCache3 = jph.a;
        jph.a(hm0Var, ophVar2);
        return ophVar2;
    }

    private final Object v(Object obj) throws IllegalAccessException, InvocationTargetException {
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        hb9 hb9VarG = ((lx9) this.h).G();
        if (hb9VarG == null) {
            String str = ((lx9) this.h).d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onCropSuccess: null id situation", null);
                    return sbiVar;
                }
            }
        } else {
            int iHeight = ((Rect) this.i).height();
            if (iHeight > 0) {
                rvc rvcVarE = ((lx9) this.h).K().a.e(hb9VarG);
                g85 g85VarC = rvcVarE != null ? rvcVarE.c() : new g85();
                RectF rectF = ((ux4) this.g).b;
                Uri uri = (Uri) this.j;
                g85VarC.a = uri;
                g85VarC.b = uri;
                vx4 vx4Var = new vx4(rectF, ((Rect) this.i).width() / iHeight, ((ux4) this.g).a);
                g85VarC.c = vx4Var;
                ((lx9) this.h).K().a.t(hb9VarG, new rvc((Uri) g85VarC.a, (Uri) g85VarC.b, vx4Var, (y26) g85VarC.d, (Uri) g85VarC.e));
                a8j.x(((lx9) this.h).w, sbiVar);
                lk9 lk9VarC = ((n0c) ((lx9) this.h).H()).c();
                n83 n83Var = new n83(2, null, 2);
                this.f = 1;
                if (yab.K0(lk9VarC, n83Var, this) == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e A[RETURN] */
    private final Object w(Object obj) {
        rt2 rt2Var;
        opa opaVar;
        jsa jsaVar = (jsa) this.j;
        ylc ylcVar = (ylc) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            rt2Var = (rt2) ylcVar.a;
            opa opaVar2 = (opa) ylcVar.b;
            zv8[] zv8VarArr = jsa.Z2;
            if (jcd.d(jsaVar.e0(), null, rt2Var, 1)) {
                opaVar = new opa(r66.a, opaVar2.b, opaVar2.c);
            } else {
                opaVar = opaVar2;
            }
            if (jsaVar.d.h()) {
                edi ediVarI0 = jsaVar.i0();
                this.g = null;
                this.h = rt2Var;
                this.i = opaVar;
                this.f = 1;
                if (ediVarI0.a(rt2Var, opaVar, this) != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i == 1) {
            opaVar = (opa) this.i;
            rt2Var = (rt2) this.h;
            ch3.d0(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            opaVar = (opa) this.i;
            ch3.d0(obj);
        }
        mjg mjgVar = jsaVar.y2;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f = 3;
        mjgVar.setValue(opaVar);
        if (sbiVar != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        zv8[] zv8VarArr2 = jsa.Z2;
        fva fvaVarG0 = jsaVar.g0();
        this.g = null;
        this.h = null;
        this.i = opaVar;
        this.f = 2;
        if (fvaVarG0.f(rt2Var, opaVar, this) != hu4Var) {
            mjg mjgVar2 = jsaVar.y2;
            this.g = null;
            this.h = null;
            this.i = null;
            this.f = 3;
            mjgVar2.setValue(opaVar);
            if (sbiVar != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                vk4 vk4Var = new vk4((ny8) obj2, (yk4) this.i, lq4Var);
                vk4Var.g = obj;
                return vk4Var;
            case 1:
                vk4 vk4Var2 = new vk4((xx6) this.h, lq4Var, (ContactListWidget) this.i, this.j, 1);
                vk4Var2.g = obj;
                return vk4Var2;
            case 2:
                return new vk4((mm4) this.i, (List) this.g, (cf7) obj2, lq4Var, 2);
            case 3:
                return new vk4((mm4) this.g, (ArrayList) obj2, lq4Var, 3);
            case 4:
                return new vk4((IssueKey) this.i, (CrashSenderImpl) this.g, (Throwable) obj2, lq4Var, 4);
            case 5:
                vk4 vk4Var3 = new vk4(5, lq4Var, this.h, this.i, obj2, false);
                vk4Var3.g = obj;
                return vk4Var3;
            case 6:
                vk4 vk4Var4 = new vk4(lq4Var, (cf7) obj2, (rre) this.i);
                vk4Var4.g = obj;
                return vk4Var4;
            case 7:
                return new vk4(7, lq4Var, (y85) this.h, (String) this.i, (kj1) this.g, (n61) obj2);
            case 8:
                vk4 vk4Var5 = new vk4(8, lq4Var, this.h, this.i, obj2, false);
                vk4Var5.g = obj;
                return vk4Var5;
            case 9:
                return new vk4((fg5) this.h, lq4Var, (Map) this.i, (jli) this.g, (s94) obj2, 9);
            case 10:
                return new vk4((fg5) this.h, lq4Var, (List) this.i, (List) this.g, (List) obj2, 10);
            case 11:
                vk4 vk4Var6 = new vk4(this.i, lq4Var, false, obj2, 11);
                vk4Var6.g = obj;
                return vk4Var6;
            case 12:
                return new vk4((iz5) this.g, (Uri) obj2, lq4Var, 12);
            case 13:
                return new vk4(13, lq4Var, (p26) this.h, (Rect) this.i, (ux4) this.g, (Uri) obj2);
            case 14:
                vk4 vk4Var7 = new vk4(this.i, lq4Var, false, obj2, 14);
                vk4Var7.g = obj;
                return vk4Var7;
            case 15:
                return new vk4((aj6) this.g, (String) obj2, lq4Var, 15);
            case 16:
                vk4 vk4Var8 = new vk4(16, lq4Var, this.h, this.i, obj2, false);
                vk4Var8.g = obj;
                return vk4Var8;
            case 17:
                return new vk4(17, lq4Var, (jv6) this.h, (rt2) this.i, (sfa) this.g, (b50) obj2);
            case 18:
                return new vk4(18, lq4Var, (c27) this.h, (String) this.i, (m8b) this.g, (Set) obj2);
            case 19:
                vk4 vk4Var9 = new vk4(this.i, lq4Var, false, obj2, 19);
                vk4Var9.g = obj;
                return vk4Var9;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new vk4((ej7) this.g, (nh7) obj2, lq4Var, 20);
            case 21:
                vk4 vk4Var10 = new vk4((rb8) obj2, lq4Var, 21);
                vk4Var10.g = obj;
                return vk4Var10;
            case 22:
                return new vk4((bf8) obj2, lq4Var, 22);
            case 23:
                return new vk4((m29) this.i, (fmg) this.g, (String) obj2, lq4Var, 23);
            case 24:
                vk4 vk4Var11 = new vk4((xx6) this.h, lq4Var, (r29) this.i, (String) obj2, 24);
                vk4Var11.g = obj;
                return vk4Var11;
            case 25:
                return new vk4((u99) this.i, (hm0) this.g, (Context) obj2, lq4Var, 25);
            case 26:
                return new vk4((v99) this.g, (Context) obj2, lq4Var, 26);
            case 27:
                return new vk4(27, lq4Var, (lx9) this.h, (Rect) this.i, (ux4) this.g, (Uri) obj2);
            case 28:
                vk4 vk4Var12 = new vk4((jsa) obj2, lq4Var, 28);
                vk4Var12.g = obj;
                return vk4Var12;
            default:
                return new vk4((jsa) this.g, (List) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((vk4) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((vk4) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((vk4) create((pzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((vk4) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((vk4) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((vk4) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((vk4) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((vk4) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((vk4) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((vk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0335 A[Catch: all -> 0x02f0, CancellationException -> 0x0374, TryCatch #1 {all -> 0x02f0, blocks: (B:131:0x02ea, B:141:0x032f, B:143:0x0335, B:144:0x0349), top: B:482:0x02ea }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0349 A[Catch: all -> 0x02f0, CancellationException -> 0x0374, TRY_LEAVE, TryCatch #1 {all -> 0x02f0, blocks: (B:131:0x02ea, B:141:0x032f, B:143:0x0335, B:144:0x0349), top: B:482:0x02ea }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0571  */
    /* JADX WARN: Code duplicated, block: B:241:0x0582  */
    /* JADX WARN: Code duplicated, block: B:244:0x0593  */
    /* JADX WARN: Code duplicated, block: B:337:0x080f A[PHI: r5 r7
  0x080f: PHI (r5v45 ozh) = (r5v44 ozh), (r5v44 ozh), (r5v49 ozh) binds: [B:330:0x07fb, B:335:0x080c, B:323:0x07bf] A[DONT_GENERATE, DONT_INLINE]
  0x080f: PHI (r7v9 pzh) = (r7v8 pzh), (r7v8 pzh), (r7v14 pzh) binds: [B:330:0x07fb, B:335:0x080c, B:323:0x07bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:340:0x0822 A[PHI: r0 r7
  0x0822: PHI (r0v37 java.lang.Object) = (r0v35 java.lang.Object), (r0v41 java.lang.Object) binds: [B:338:0x081f, B:322:0x07b4] A[DONT_GENERATE, DONT_INLINE]
  0x0822: PHI (r7v10 pzh) = (r7v9 pzh), (r7v15 pzh) binds: [B:338:0x081f, B:322:0x07b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x09be  */
    /* JADX WARN: Code duplicated, block: B:418:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:421:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:503:0x0a0b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x09ee A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d0, code lost:
    
        if (r0.emit(r3, r26) == r2) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x057f, code lost:
    
        if (r2.n(r0, r26) == r13) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05a6, code lost:
    
        if (r4.u(r2, r0, r26) == r13) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x082a, code lost:
    
        if (r1 == r3) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x09db, code lost:
    
        if (r5 == r2) goto L426;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:413:0x09db -> B:415:0x09de). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk4(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        super(2, lq4Var);
        this.e = 6;
        this.i = rreVar;
        this.j = cf7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(fg5 fg5Var, lq4 lq4Var, Object obj, Object obj2, Object obj3, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = fg5Var;
        this.i = obj;
        this.g = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(xx6 xx6Var, lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xx6Var;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk4(ny8 ny8Var, yk4 yk4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.j = ny8Var;
        this.i = yk4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(Object obj, lq4 lq4Var, boolean z, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk4(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = obj2;
        this.j = obj3;
    }
}
