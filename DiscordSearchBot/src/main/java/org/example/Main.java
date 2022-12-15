package org.example;


public class Main {
    public static void main(String[] args) { // Not Used as actual main
        
        //If needed I can email the bot token. Discord automatically changed it when it noticed I posted it on Github.
        String Token = "Bot Token goes here";

        //This code only needs to be run once per new command, greyed out is already on the bot and is kept here as a reminder.
        //Does NOT need to be done each time code is run.
            //Has to be kept running for over a minute or so before the Search Bot's command list is updated

        /* Ping Command:
        DiscordApi api = new DiscordApiBuilder().setToken(Token).login().join();

        SlashCommand.with("ping", "A simple ping pong command!").createGlobal(api).join();*/

        /* Disconnect Command:
        DiscordApi api = new DiscordApiBuilder().setToken(Token).login().join();

        SlashCommand.with("disconnect", "A command to disconnect this bot.").createGlobal(api).join();*/

        /* Google Search Command:
        DiscordApi api = new DiscordApiBuilder().setToken(Token).login().join();

        List<SlashCommandOption> query = new ArrayList<SlashCommandOption>();
         query.add (SlashCommandOption.create(SlashCommandOptionType.STRING, "query", "What you want to search", true));

        SlashCommand.with("search", "A simple google search command", query).createGlobal(api).join();*/

        /* Google Search Command:
        DiscordApi api = new DiscordApiBuilder().setToken(Token).login().join();

        List<SlashCommandOption> query = new ArrayList<SlashCommandOption>();
         query.add (SlashCommandOption.create(SlashCommandOptionType.STRING, "query", "What wiki cite you want to search for", true));

        SlashCommand.with("searchwiki", "A Wikipedia search command", query).createGlobal(api).join();*/



    }
}
