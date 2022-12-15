package org.example;


import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.MessageFlag;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.interaction.SlashCommandInteraction;


public class SearchBot {

    public static void main(String[] args) {

        //If the discord bot token is needed to test my project please let me know and I will email it to you.
        String Token = "Discord Bot Token Goes Here";
        DiscordApi api = new DiscordApiBuilder().setToken(Token).login().join();

        api.addSlashCommandCreateListener(event -> {
            SlashCommandInteraction slashCommandInteraction = event.getSlashCommandInteraction();
            if (slashCommandInteraction.getCommandName().equals("ping")) {
                slashCommandInteraction.createImmediateResponder()
                        .setContent("Pong!")
                        .setFlags(MessageFlag.EPHEMERAL) // Only visible for the user which used the command
                        .respond();
            }
            else if (slashCommandInteraction.getCommandName().equals("search")){
                String Input = String.valueOf(slashCommandInteraction.getArgumentStringValueByName("query")); //uses this to get info from search command
                Input = Input.substring(9,(Input.length()-1));
                String Url = "https://www.google.com/search?q=" + Input; //converts to a search url for google

                EmbedBuilder Results = new EmbedBuilder()   //Creates an embed to list results
                        .setTitle("Google search results for " + Input + ":")
                                .setDescription(Url);

                slashCommandInteraction.createImmediateResponder()
                        .addEmbed(Results)
                        .respond();
            }
            else if (slashCommandInteraction.getCommandName().equals("searchwiki")){
                String Input = String.valueOf(slashCommandInteraction.getArgumentStringValueByName("query")); //uses this to get info from search command
                Input = Input.substring(9,(Input.length()-1));
                String Url = "https://en.wikipedia.org/wiki/" + Input; //converts to a search url for google

                EmbedBuilder Results = new EmbedBuilder()   //Creates an embed to list results
                        .setTitle("Wikipedia search results for " + Input + ":")
                        .setDescription(Url);

                slashCommandInteraction.createImmediateResponder()
                        .addEmbed(Results)
                        .respond();
            }
            else if (slashCommandInteraction.getCommandName().equals("disconnect")){
                api.disconnect(); //disconnects bot
            }
        });
    }
}
