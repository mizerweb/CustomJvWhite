package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lu6 extends oc9 {
    public static void k0(File file, File file2) {
        if (!file.exists()) {
            throw new NoSuchFileException(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                egl.a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static boolean l0(File file) {
        at6 at6Var = new at6(new ct6(file));
        while (true) {
            boolean z = true;
            while (at6Var.hasNext()) {
                File file2 = (File) at6Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String m0(File file) {
        return r5h.r1('.', file.getName(), "");
    }

    public static byte[] n0(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    oh6 oh6Var = new oh6();
                    oh6Var.write(i5);
                    egl.a(fileInputStream, oh6Var);
                    int size = oh6Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrL = oh6Var.l();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrL, 0, bArrCopyOf, i, oh6Var.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList o0(File file) throws IOException {
        Charset charset = pt2.a;
        ArrayList arrayList = new ArrayList();
        mu6 mu6Var = new mu6(0, arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new nf4(new tw(1, bufferedReader)).iterator();
            while (it.hasNext()) {
                mu6Var.invoke(it.next());
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static String p0(File file, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strI = gm0.I(inputStreamReader);
            inputStreamReader.close();
            return strI;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static File q0(File file, String str) {
        int iU0;
        File file2 = new File(str);
        String path = file2.getPath();
        char c = File.separatorChar;
        int length = 0;
        int iU1 = r5h.U0(path, c, 0, 4);
        if (iU1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iU0 = r5h.U0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iU2 = r5h.U0(path, c, iU0 + 1, 4);
                length = iU2 >= 0 ? iU2 + 1 : path.length();
            }
        } else if (iU1 > 0 && path.charAt(iU1 - 1) == ':') {
            length = iU1 + 1;
        } else if (iU1 == -1 && r5h.N0(path, ':')) {
            length = path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        if (string.length() == 0 || r5h.N0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static void r0(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static void s0(File file, String str) {
        Charset charset = pt2.a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            t0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void t0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                ore.k("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
