package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class i3c implements q18 {
    public static final Pattern l = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern m = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final u1i a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h = i3c.class.getName();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final f8b k;

    public i3c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, u1i u1iVar, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = u1iVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        f8b f8bVar = jj8.a;
        f8b f8bVar2 = new f8b(1);
        f8bVar2.h(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
        this.k = f8bVar2;
    }

    public static String e(pne pneVar) {
        String strA = pne.A(pneVar, "Content-Disposition");
        if (strA == null || strA.length() == 0) {
            return null;
        }
        Matcher matcher = m.matcher(strA);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static File h(File file, String str) throws NoSuchAlgorithmException {
        if (file == null) {
            ore.p("Required value was null.");
            return null;
        }
        String parent = file.getParent();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String name = file.getName();
        Charset charset = pt2.a;
        messageDigest.update(name.getBytes(charset));
        messageDigest.update(str != null ? str.getBytes(charset) : new byte[0]);
        return new File(parent, av7.h(messageDigest.digest()).concat(".part"));
    }

    public static boolean i(Throwable th) {
        if (th instanceof IOException) {
            String message = th.getMessage();
            if (message != null ? r5h.L0(message.toLowerCase(Locale.getDefault()), "canceled", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(Throwable th) {
        return (th instanceof SocketException) || (th.getCause() instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException);
    }

    public static boolean m(Exception exc) {
        Throwable cause = exc.getCause();
        ErrnoException errnoException = cause instanceof ErrnoException ? (ErrnoException) cause : null;
        if (errnoException == null) {
            ErrnoException errnoException2 = exc instanceof ErrnoException ? (ErrnoException) exc : null;
            if (errnoException2 == null) {
                return false;
            }
            errnoException = errnoException2;
        }
        return errnoException.errno == OsConstants.ENOSPC;
    }

    public static boolean n(String str) {
        Set setP1 = a.p1(new sya[]{sya.TEXT_HTML, sya.TEXT_PLAIN});
        if (!setP1.isEmpty()) {
            Iterator it = setP1.iterator();
            while (it.hasNext()) {
                if (r5h.L0(str, ((sya) it.next()).a, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void w(i3c i3cVar, w2c w2cVar, String str, Integer num, Throwable th, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        i3cVar.v(w2cVar, str, num, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.q18
    public final Object a(File file, String str, nq4 nq4Var) {
        z2c z2cVar;
        Iterator it;
        if (nq4Var instanceof z2c) {
            z2cVar = (z2c) nq4Var;
            int i = z2cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2cVar.g = i - Integer.MIN_VALUE;
            } else {
                z2cVar = new z2c(this, nq4Var);
            }
        } else {
            z2cVar = new z2c(this, nq4Var);
        }
        Object obj = z2cVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = z2cVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String absolutePath = h(file, str).getAbsolutePath();
            y2c y2cVar = (y2c) this.i.get(absolutePath);
            String str2 = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qt4.n("File download. Cancel download, attachId:", str, ", task exist:", y2cVar != null), null);
                }
            }
            this.j.remove(absolutePath);
            if (y2cVar != null) {
                y2cVar.a.d();
                it = y2cVar.b.iterator();
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it = z2cVar.d;
        ch3.d0(obj);
        while (it.hasNext()) {
            o18 o18Var = (o18) it.next();
            if (o18Var != null) {
                z2cVar.d = it;
                z2cVar.g = 1;
                if (o18Var.a(z2cVar) == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // defpackage.q18
    public final Object b(String str, File file, o18 o18Var, String str2, boolean z, String str3, String str4, lq4 lq4Var) throws Throwable {
        a3c a3cVar;
        String str5;
        File fileH;
        Object poeVar;
        boolean zBooleanValue;
        File file2;
        File file3;
        File file4;
        Object poeVar2;
        Long lC0;
        if (lq4Var instanceof a3c) {
            a3cVar = (a3c) lq4Var;
            int i = a3cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3cVar.g = i - Integer.MIN_VALUE;
            } else {
                a3cVar = new a3c(this, (nq4) lq4Var);
            }
        } else {
            a3cVar = new a3c(this, (nq4) lq4Var);
        }
        a3c a3cVar2 = a3cVar;
        Object objQ = a3cVar2.e;
        Object obj = hu4.a;
        int i2 = a3cVar2.g;
        String strF = null;
        if (i2 == 0) {
            ch3.d0(objQ);
            String str6 = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                str5 = str;
            } else {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    str5 = str;
                    a4cVar.c(je9Var, str6, qv1.k("File download. url = ", str5), null);
                } else {
                    str5 = str;
                }
            }
            fileH = h(file, str2);
            y2c y2cVar = (y2c) this.i.get(fileH.getAbsolutePath());
            if (y2cVar != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = y2cVar.b;
                int size = copyOnWriteArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    o18 o18Var2 = (o18) copyOnWriteArrayList.get(i3);
                    if (o18Var2 != null) {
                        strF = o18Var2.f();
                    }
                    if (cqk.d(strF, o18Var != null ? o18Var.f() : null)) {
                        gm0.n(this.h, "File download. File already downloading in listener context, do nothing");
                        g().f.a(new nqc(str3));
                        return n18.a;
                    }
                    i3++;
                    strF = null;
                }
            }
            f().d(2L);
            try {
                poeVar = Uri.parse(str5);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            Uri uri = (Uri) poeVar;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                zBooleanValue = true;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter(ClientCookie.EXPIRES_ATTR);
                    poeVar2 = Boolean.valueOf(((s7f) ((et3) this.f.getValue())).f() >= ((queryParameter == null || (lC0 = y5h.C0(queryParameter)) == null) ? BuildConfig.MAX_TIME_TO_UPLOAD : lC0.longValue()));
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                Object obj2 = Boolean.FALSE;
                if (poeVar2 instanceof poe) {
                    poeVar2 = obj2;
                }
                zBooleanValue = ((Boolean) poeVar2).booleanValue();
            }
            if (zBooleanValue) {
                qrc.o(g(), ls5.URL_EXPIRED_FOR_NON_AUDIO, str3, null, null, 28);
                if (o18Var != null) {
                    a3cVar2.d = fileH;
                    a3cVar2.g = 1;
                    if (o18Var.b(a3cVar2) != obj) {
                        file4 = fileH;
                        fileH = file4;
                    }
                }
            } else {
                try {
                    a3cVar2.d = fileH;
                    a3cVar2.g = 2;
                    file2 = fileH;
                    try {
                        objQ = q(str5, o18Var, file2, file, z, str3, str4, a3cVar2);
                        if (objQ != obj) {
                            file3 = file2;
                            n18 n18Var = (n18) objQ;
                            this.j.remove(file3.getAbsolutePath());
                            f().a(2L);
                            return n18Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file3 = file2;
                        this.j.remove(file3.getAbsolutePath());
                        f().a(2L);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    file2 = fileH;
                }
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file3 = a3cVar2.d;
            try {
                ch3.d0(objQ);
                n18 n18Var2 = (n18) objQ;
                this.j.remove(file3.getAbsolutePath());
                f().a(2L);
                return n18Var2;
            } catch (Throwable th5) {
                th = th5;
                this.j.remove(file3.getAbsolutePath());
                f().a(2L);
                throw th;
            }
        }
        file4 = a3cVar2.d;
        ch3.d0(objQ);
        fileH = file4;
        fileH.delete();
        f().a(2L);
        return n18.c;
    }

    @Override // defpackage.q18
    public final Object c(File file, String str, nq4 nq4Var) {
        String absolutePath = h(file, str).getAbsolutePath();
        y2c y2cVar = (y2c) this.i.get(absolutePath);
        String str2 = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qt4.n("File download. Silent cancel download, attachId:", str, ", task exist:", y2cVar != null), null);
            }
        }
        if (y2cVar != null) {
            y2cVar.a.d();
            t(y2cVar, absolutePath);
        }
        return sbi.a;
    }

    public final File d(File file, File file2, String str) {
        String str2 = this.h;
        try {
            gm0.n(str2, "File download. Start copy data from temp file to output");
            if (str != null && str.length() != 0) {
                String name = file2.getName();
                int iY0 = r5h.Y0(name, '.', 0, 6);
                if (iY0 >= 0) {
                    name = name.substring(0, iY0);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            File parentFile = file2.getParentFile();
            File fileT = parentFile != null ? ku6.t(parentFile, file2.getName()) : null;
            Path path = file.toPath();
            if (fileT == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Files.move(path, fileT.toPath(), new CopyOption[0]);
            gm0.n(str2, "File download. Finish copy data");
            return fileT;
        } catch (IOException e) {
            gm0.Y(str2, e.getMessage());
            return null;
        }
    }

    public final zid f() {
        return (zid) this.d.getValue();
    }

    public final os5 g() {
        return (os5) this.c.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x033a -> B:135:0x0340). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x034d -> B:125:0x0308). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x03b1 -> B:168:0x03df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x03cf -> B:167:0x03d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x03e8 -> B:176:0x03f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public final java.lang.Object j(defpackage.rne r28, long r29, java.io.File r31, defpackage.pne r32, defpackage.y2c r33, java.io.File r34, boolean r35, java.lang.String r36, defpackage.nq4 r37) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3c.j(rne, long, java.io.File, pne, y2c, java.io.File, boolean, java.lang.String, nq4):java.lang.Object");
    }

    public final boolean k(String str, String str2, String str3) {
        String strD;
        return (!((Boolean) ((e5d) this.g.getValue()).k2.a(e5d.S6[166]).i()).booleanValue() || str2 == null || str2.length() == 0 || (strD = ixl.d(str)) == null || strD.equals(str2) || ((String) this.j.get(str3)) != null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[Catch: CancellationException -> 0x003b, all -> 0x00c7, TryCatch #0 {CancellationException -> 0x003b, blocks: (B:13:0x0030, B:45:0x00b4, B:47:0x00be, B:48:0x00c2, B:52:0x00ce, B:51:0x00c9), top: B:63:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[Catch: CancellationException -> 0x003b, all -> 0x00c7, TryCatch #0 {CancellationException -> 0x003b, blocks: (B:13:0x0030, B:45:0x00b4, B:47:0x00be, B:48:0x00c2, B:52:0x00ce, B:51:0x00c9), top: B:63:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[EDGE_INSN: B:56:0x00e2->B:57:0x00e3 BREAK  A[LOOP:0: B:41:0x00a6->B:70:0x00a6]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e2 -> B:57:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(java.lang.Throwable r12, defpackage.dle r13, java.io.File r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3c.o(java.lang.Throwable, dle, java.io.File, nq4):java.lang.Object");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x08d0 -> B:583:0x0566). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:347:0x09f0 -> B:559:0x0a13). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:398:0x0b12 -> B:406:0x0b4e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:404:0x0b48 -> B:405:0x0b4b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:413:0x0b57 -> B:610:0x0b06). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:540:0x0d3b -> B:541:0x0d3c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Enum p(defpackage.pne r66, defpackage.y2c r67, java.io.File r68, java.io.File r69, boolean r70, java.lang.String r71, defpackage.nq4 r72) {
        /*
            Method dump skipped, instruction units count: 3464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3c.p(pne, y2c, java.io.File, java.io.File, boolean, java.lang.String, nq4):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x027b  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0305  */
    /* JADX WARN: Code duplicated, block: B:81:0x032d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0332  */
    /* JADX WARN: Code duplicated, block: B:85:0x0341  */
    /* JADX WARN: Code duplicated, block: B:87:0x036b  */
    /* JADX WARN: Code duplicated, block: B:89:0x037c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x03cf  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x031f, code lost:
    
        if (r5.o(r0, r15, r3, r13) == r10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03fd, code lost:
    
        if (r1 == r10) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r32, defpackage.o18 r33, java.io.File r34, java.io.File r35, boolean r36, java.lang.String r37, java.lang.String r38, defpackage.nq4 r39) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3c.q(java.lang.String, o18, java.io.File, java.io.File, boolean, java.lang.String, java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object r(k28 k28Var, String str, o18 o18Var, File file, nq4 nq4Var) {
        f3c f3cVar;
        File file2;
        if (nq4Var instanceof f3c) {
            f3cVar = (f3c) nq4Var;
            int i = f3cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                f3cVar.g = i - Integer.MIN_VALUE;
            } else {
                f3cVar = new f3c(this, nq4Var);
            }
        } else {
            f3cVar = new f3c(this, nq4Var);
        }
        f3c f3cVar2 = f3cVar;
        Object obj = f3cVar2.e;
        int i2 = f3cVar2.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (k28Var != null) {
                String str2 = this.h;
                gm0.n(str2, "File download. Start");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList(20);
                String string = UUID.randomUUID().toString();
                if (string == null) {
                    linkedHashMap.remove(Object.class);
                } else {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(Object.class, Object.class.cast(string));
                }
                if (file.exists() && file.length() > 0) {
                    gm0.n(str2, "File download. resume download file, downloaded size: " + file.length());
                    String str3 = "bytes=" + file.length() + "-";
                    e9i.u("Range");
                    e9i.x(str3, "Range");
                    arrayList.add("Range");
                    arrayList.add(r5h.y1(str3).toString());
                }
                hu7 hu7Var = new hu7((String[]) arrayList.toArray(new String[0]));
                byte[] bArr = uqi.a;
                return new dle(k28Var, HttpGet.METHOD_NAME, hu7Var, null, linkedHashMap.isEmpty() ? s66.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
            }
            qrc.o(g(), ls5.ERROR_CREATING_REQUEST, str, null, null, 28);
            w(this, w2c.ERROR_CREATING_REQUEST, null, null, null, 12);
            file2 = file;
            if (o18Var != null) {
                f3cVar2.d = file2;
                f3cVar2.g = 1;
                Object objB = o18Var.b(f3cVar2);
                Object obj2 = hu4.a;
                if (objB == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file3 = f3cVar2.d;
            ch3.d0(obj);
            file2 = file3;
        }
        file2.delete();
        f().a(2L);
        return new poe(new IllegalArgumentException("HttpUrl is null"));
    }

    public final void s(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        y2c y2cVar = (y2c) this.i.remove(str);
        if (y2cVar == null || (copyOnWriteArrayList = y2cVar.b) == null) {
            return;
        }
        copyOnWriteArrayList.clear();
    }

    public final void t(y2c y2cVar, String str) {
        y2cVar.b.clear();
        this.i.remove(str);
        this.j.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(y8e y8eVar, nq4 nq4Var) {
        g3c g3cVar;
        if (nq4Var instanceof g3c) {
            g3cVar = (g3c) nq4Var;
            int i = g3cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3cVar.f = i - Integer.MIN_VALUE;
            } else {
                g3cVar = new g3c(this, nq4Var);
            }
        } else {
            g3cVar = new g3c(this, nq4Var);
        }
        Object objV = g3cVar.d;
        int i2 = g3cVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objV);
                iua iuaVar = new iua(13, y8eVar);
                g3cVar.f = 1;
                objV = qyj.V(k66.a, iuaVar, g3cVar);
                hu4 hu4Var = hu4.a;
                if (objV == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objV);
            }
            return (pne) objV;
        } catch (IOException e) {
            return new poe(e);
        }
    }

    public final void v(w2c w2cVar, String str, Integer num, Throwable th) {
        bk5 bk5Var = (bk5) ((e5d) this.g.getValue()).j().i();
        bk5Var.getClass();
        zv8 zv8Var = bk5.c[5];
        if (bk5Var.b("download_error")) {
            String str2 = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "File download. Report devnull DOWNLOAD_ERROR reason=" + w2cVar.a + " code=" + num, null);
                }
            }
            yj5.a((yj5) this.e.getValue(), xj5.DOWNLOAD_ERROR, this.a.a(), ((wd4) this.a.b.getValue()).c() ? 1.0f : 0.0f, num != null ? num.intValue() : Float.NaN, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, w2cVar.a, th != null ? th.getClass().getName() : null, th != null ? th.getMessage() : null, str, null, null, null, -1966096);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005b -> B:21:0x0040). Please report as a decompilation issue!!! */
    public final Object x(y2c y2cVar, File file, nq4 nq4Var) {
        h3c h3cVar;
        Iterator it;
        if (nq4Var instanceof h3c) {
            h3cVar = (h3c) nq4Var;
            int i = h3cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                h3cVar.g = i - Integer.MIN_VALUE;
            } else {
                h3cVar = new h3c(this, nq4Var);
            }
        } else {
            h3cVar = new h3c(this, nq4Var);
        }
        Object obj = h3cVar.e;
        int i2 = h3cVar.g;
        String str = this.h;
        if (i2 == 0) {
            ch3.d0(obj);
            file.delete();
            it = y2cVar.b.iterator();
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = h3cVar.d;
            try {
                ch3.d0(obj);
            } catch (CancellationException e) {
                gm0.n(str, "urlExpired: cancel");
                throw e;
            } catch (Throwable th) {
                gm0.V(str, "File download. Failed to notify listener on url expired", new x2c("File download. Failed to notify listener on url expired", th));
            }
        }
        while (it.hasNext()) {
            o18 o18Var = (o18) it.next();
            if (o18Var != null) {
                h3cVar.d = it;
                h3cVar.g = 1;
                Object objD = o18Var.d(h3cVar);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbi.a;
    }
}
