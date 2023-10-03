public class LogLevels {

    public static String message(String logLine) {
        String cleanedLogLine = logLine.replaceAll("\\s+", " ").trim();

        if (cleanedLogLine.startsWith("[ERROR]: ")) {
            return cleanedLogLine.substring("[ERROR]: ".length());
        } else if (cleanedLogLine.startsWith("[WARNING]: ")) {
            return cleanedLogLine.substring("[WARNING]: ".length());
        } else if (cleanedLogLine.startsWith("[INFO]: ")) {
            return cleanedLogLine.substring("[INFO]: ".length());
        }

        return cleanedLogLine;
    }


    public static String logLevel(String logLine) {
        String trimmedLogLine = logLine.trim();
        if (trimmedLogLine.startsWith("[ERROR]: ")) {
            return "error".toLowerCase();
        } else if (trimmedLogLine.startsWith("[WARNING]: ")) {
            return "warning".toLowerCase();
        } else if (trimmedLogLine.startsWith("[INFO]: ")) {
            return "info".toLowerCase();
        }else {
            return "";
        }    }

    public static String reformat(String logLine) {
        String trimmedLogLine = logLine.trim();

        String logLevel = "";
        String message = "";

        if (trimmedLogLine.startsWith("[ERROR]: ")) {
            logLevel = "error";
            message = trimmedLogLine.substring("[ERROR]: ".length()).trim();
        } else if (trimmedLogLine.startsWith("[WARNING]: ")) {
            logLevel = "warning";
            message = trimmedLogLine.substring("[WARNING]: ".length()).trim();
        } else if (trimmedLogLine.startsWith("[INFO]: ")) {
            logLevel = "info";
            message = trimmedLogLine.substring("[INFO]: ".length()).trim();
        }

        return message + " (" + logLevel + ")";
    }
}
