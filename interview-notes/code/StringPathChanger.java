package com.codility;

public class StringPathChanger {

    public String changeDirectoryString(String currentDirectory, String command) {

        if (!command.startsWith("cd")) {
            throw new IllegalStateException();
        }

        String currDir[] = currentDirectory.split("/");
        int directoryIdx = currDir.length;

        // int startingIdx = command.lastIndexOf("cd "); // can be hardcoded as well.
        // System.out.println(startingIdx);
        String exactCommand = command.substring(3, command.length());
        if ((exactCommand.length() == 1) && (exactCommand.equals("/"))) {
            return "/";
        }

        if (exactCommand.startsWith("/")) {
            return exactCommand;
        }

        String cmdDir[] = exactCommand.split("/");

        StringBuilder sb = new StringBuilder();

        int lenCmd = cmdDir.length;
        for (int i = 0; i < lenCmd; i++) {
            if (cmdDir[i].equals("..")) {
                directoryIdx--;
            } else {
                sb.append(cmdDir[i]);
                sb.append("/");
            }
        }

        StringBuilder dir = new StringBuilder();
        for (int i = 0; i < directoryIdx; i++) {
            dir.append(currDir[i]);
            dir.append("/");
        }

        String finalPath = dir.toString() + sb.toString();
        finalPath = (finalPath.lastIndexOf("/") == finalPath.length() - 1)
                ? finalPath.substring(0, finalPath.length() - 1)
                : finalPath;

        return finalPath;
    }
}
